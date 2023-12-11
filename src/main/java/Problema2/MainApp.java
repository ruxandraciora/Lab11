package Problema2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2_1.xml");
        Vehicul v1 =(Vehicul)context.getBean("vehicul1");
        System.out.println(v1);

        Vehicul a1 = (Vehicul)context.getBean("autoturism1");
        System.out.println(a1);

        Vehicul a2 = (Vehicul)context.getBean("autoturism2");
        System.out.println(a2);

        Vehicul m1 = (Vehicul)context.getBean("motocicleta");
        System.out.println(m1);

    }
}




/*<bean id="autoturism1" class="Problema2.Autoturism" parent="vehicul1" autowire="byName">
        <property name="volum" value="1000"/>
        <property name="kg" value="2000"/>
    </bean>*/