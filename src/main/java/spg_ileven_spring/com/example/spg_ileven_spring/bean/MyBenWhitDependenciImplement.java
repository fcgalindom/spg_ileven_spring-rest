package spg_ileven_spring.com.example.spg_ileven_spring.bean;

public class MyBenWhitDependenciImplement implements MyBeanWhitDependenci {
    private MyOperation myOperation;

    public MyBenWhitDependenciImplement(MyOperation myOperation){
        this.myOperation = myOperation;
    }

    @Override
    public void printWhitDependenci() {
        int numero  =  1;

        System.out.println(myOperation.sum(numero));
        System.out.println("Hola funciona");


    }
}
