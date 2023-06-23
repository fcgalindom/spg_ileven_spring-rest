package spg_ileven_spring.com.example.spg_ileven_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.User;

import spg_ileven_spring.com.example.spg_ileven_spring.entity.UserType;
import spg_ileven_spring.com.example.spg_ileven_spring.repository.UserRepository;
import spg_ileven_spring.com.example.spg_ileven_spring.repository.UserTypeRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class SpgIlevenSpringApplication implements CommandLineRunner {


	private UserRepository userRepository;
	@Autowired
	private UserTypeRepository userTypeRepository;




	public SpgIlevenSpringApplication(){

	}
	public static void main(String[] args) {
		SpringApplication.run(SpgIlevenSpringApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {



	}




	private void saveUserInDatabase() {}

}
