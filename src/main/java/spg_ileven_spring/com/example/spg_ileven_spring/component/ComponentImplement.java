package spg_ileven_spring.com.example.spg_ileven_spring.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement  implements  ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("hola mundo");
    }
}
