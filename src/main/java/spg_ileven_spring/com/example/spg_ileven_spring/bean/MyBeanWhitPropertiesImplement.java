package spg_ileven_spring.com.example.spg_ileven_spring.bean;

public class MyBeanWhitPropertiesImplement  implements MyBeanWhitProperties
{
    private  String nombre;
    private String apellido;

    public  MyBeanWhitPropertiesImplement(String nombre , String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String Properties() {
        return nombre +"-"+ apellido ;
    }
}
