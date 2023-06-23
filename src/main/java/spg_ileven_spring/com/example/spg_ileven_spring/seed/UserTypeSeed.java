package spg_ileven_spring.com.example.spg_ileven_spring.seed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.UserType;
import spg_ileven_spring.com.example.spg_ileven_spring.repository.UserTypeRepository;
@Component
public class UserTypeSeed  implements CommandLineRunner {
    private final UserTypeRepository userTypeRepository;
    public UserTypeSeed(UserTypeRepository userTypeRepository){
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Agregar datos de ejemplo
        seedUsers();
    }
    private void seedUsers() {
        UserType typerepository1 = new UserType("admin");
        UserType typerepository2 = new UserType("usuarios");
        userTypeRepository.save(typerepository1);
        userTypeRepository.save(typerepository2);


    }
}
