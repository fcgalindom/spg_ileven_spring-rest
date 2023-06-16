package spg_ileven_spring.com.example.spg_ileven_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.User;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository   extends JpaRepository <User,Long> {


    @Query("SELECT u FROM User u WHERE u.email = ?1")
    List<User> findUserByEmail(String email);





}
