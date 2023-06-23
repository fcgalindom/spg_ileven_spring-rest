package spg_ileven_spring.com.example.spg_ileven_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.UserType;
@Repository
public interface UserTypeRepository extends JpaRepository <UserType,Long> { }


