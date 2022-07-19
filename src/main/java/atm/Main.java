package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(ATMConfig.class);
        AtmUI atmUI = app.getBean(AtmUI.class);
        atmUI.run();
    }
}
