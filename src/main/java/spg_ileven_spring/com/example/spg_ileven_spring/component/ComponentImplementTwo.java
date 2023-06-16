package spg_ileven_spring.com.example.spg_ileven_spring.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ComponentImplementTwo")
public class ComponentImplementTwo implements  ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("ver Datos");
    }
}
