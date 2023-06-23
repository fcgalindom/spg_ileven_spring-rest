package spg_ileven_spring.com.example.spg_ileven_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.User;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.UserType;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository   extends JpaRepository <User,Long> {

    List<User> findByUserType_Id(Long typeId);


}
