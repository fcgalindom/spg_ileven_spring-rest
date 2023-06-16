package spg_ileven_spring.com.example.spg_ileven_spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.Post;

@Repository
public interface PostRepository  extends JpaRepository<Post,Long> {


}
