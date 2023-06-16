package spg_ileven_spring.com.example.spg_ileven_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spg_ileven_spring.com.example.spg_ileven_spring.bean.MyBean;
import spg_ileven_spring.com.example.spg_ileven_spring.bean.MyBeanWhitDependenci;
import spg_ileven_spring.com.example.spg_ileven_spring.bean.MyBeanWhitProperties;
import spg_ileven_spring.com.example.spg_ileven_spring.component.ComponentDependency;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.User;
import spg_ileven_spring.com.example.spg_ileven_spring.pojo.UserPojo;
import spg_ileven_spring.com.example.spg_ileven_spring.repository.UserRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class SpgIlevenSpringApplication implements CommandLineRunner {

    private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWhitDependenci myBeanWhitDependenci;
	private MyBeanWhitProperties myBeanWhitProperties;

	private UserPojo userPojo;
	private UserRepository userRepository;


	public SpgIlevenSpringApplication(@Qualifier("ComponentImplementTwo") ComponentDependency componentDependency ,MyBean myBean , MyBeanWhitDependenci myBeanWhitDependenci  , MyBeanWhitProperties myBeanWhitProperties , UserPojo userPojo ,UserRepository userRepository){
        this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWhitDependenci = myBeanWhitDependenci;
		this.myBeanWhitProperties = myBeanWhitProperties;
		this.userPojo = userPojo;
		this.userRepository = userRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpgIlevenSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
      saveUserInDatabase();
	  getInformationSqlFormUser();
	}
	private void saveUserInDatabase(){
		User user1 =  new User("felipe","felipe@gmail", LocalDate.of(2021,03,12));
		User user2 =  new User("felipe2","felip2e@gmail", LocalDate.of(2021,03,12));
		User user3 =  new User("juan3","juan3@gmail", LocalDate.of(2022,04,23));
		List<User> list = Arrays.asList(user1,user2,user3);
		list.stream().forEach(userRepository::save);

	}
	private void getInformationSqlFormUser(){

		System.out.println("el usuario"+ userRepository.findUserByEmail("juan3@gmail"));
	}
	public void ejercios (){
		componentDependency.saludar();
		myBean.print();
		myBeanWhitDependenci.printWhitDependenci();
		System.out.println(myBeanWhitProperties.Properties());
		System.out.println(userPojo.getEmail()+  "  *  " +  userPojo.getPassword() + "  edad  " + userPojo.getAge());
	}
}
