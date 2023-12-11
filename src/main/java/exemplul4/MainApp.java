package exemplul4;

import exemplul4.Persoana;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
class MainApp {
    public static void main(String []args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans04.xml");
        exemplul4.Persoana p=(Persoana)context.getBean("pers");
        System.out.print(p);
    }
}