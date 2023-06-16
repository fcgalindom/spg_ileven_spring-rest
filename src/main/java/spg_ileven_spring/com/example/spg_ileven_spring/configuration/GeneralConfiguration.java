package spg_ileven_spring.com.example.spg_ileven_spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spg_ileven_spring.com.example.spg_ileven_spring.bean.MyBeanWhitProperties;
import spg_ileven_spring.com.example.spg_ileven_spring.bean.MyBeanWhitPropertiesImplement;
import spg_ileven_spring.com.example.spg_ileven_spring.pojo.UserPojo;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.nombre}")
    private String nombre;
    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;
    @Bean
    public MyBeanWhitProperties function (){
        return  new MyBeanWhitPropertiesImplement(nombre,apellido);
    }







}
