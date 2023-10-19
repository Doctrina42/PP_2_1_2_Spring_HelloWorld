import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(bean3.getMessage());
        System.out.println(bean.equals(bean1));
        System.out.println(bean2.equals(bean3));
    }
}