package spg_ileven_spring.com.example.spg_ileven_spring.controller;

// UserController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.User;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.UserType;
import spg_ileven_spring.com.example.spg_ileven_spring.repository.UserRepository;
import spg_ileven_spring.com.example.spg_ileven_spring.responce.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {

        if (user.getUserType() == null) {
            return ResponseEntity.badRequest().body("TypeUser is required");
        }
        userRepository.save(user);
        return ResponseEntity.ok("User created successfully");
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    if (updatedUser.getName() != null) {
                        user.setName(updatedUser.getName());
                    }
                    if (updatedUser.getEmail() != null) {
                        user.setEmail(updatedUser.getEmail());
                    }
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
    @GetMapping("/byType/{typeId}")
    public ResponseEntity<List<User>> getUsersByType(@PathVariable Long typeId) {
        List<User> users = userRepository.findByUserType_Id(typeId);

        // Puedes realizar otras operaciones con los usuarios si es necesario
        return ResponseEntity.ok(users);
    }


}
