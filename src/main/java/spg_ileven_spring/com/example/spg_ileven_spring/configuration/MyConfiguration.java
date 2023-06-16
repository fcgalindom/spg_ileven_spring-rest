package spg_ileven_spring.com.example.spg_ileven_spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spg_ileven_spring.com.example.spg_ileven_spring.bean.*;

@Configuration
public class MyConfiguration {
    @Bean
    public MyBean beanOperation(){
        return  new MyBeanImplemt();

    }
    @Bean
    public MyOperation beanOperationOpetration(){
        return new MyOperationImplement();
    }
    @Bean
    public MyBeanWhitDependenci beenOperationWhitDependency(MyOperation myOperation){
        return new MyBenWhitDependenciImplement(myOperation);
    }







}
