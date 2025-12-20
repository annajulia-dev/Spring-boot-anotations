package createBeans.bean_programmatically;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var p = new Parrot();
        p.setName("Madoka");

        Supplier<Parrot> parrotSupplier = () -> p;

        context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

        var parrotBean = context.getBean("parrot1", Parrot.class);

        System.out.println(parrotBean.getName());
    }
}
