package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection by SPRING
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        AtmUI atmUI = app.getBean(AtmUI.class);
        atmUI.run();

        // Similar to
        // new AnnotationConfigApplicationContext(AtmConfig.class).getBean(AtmUI.class).run();
        // Using SPRING makes code shorter.
    }
}
