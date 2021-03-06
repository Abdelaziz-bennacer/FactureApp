package fr.abdel;

import fr.abdel.controller.InterfaceFactureController;
import fr.abdel.service.InterfaceFactureService;
import fr.abdel.service.prefix.FactureServicePrefix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@SpringBootApplication
//@Configuration
//@ComponentScan
//@PropertySource("classpath:application.properties")
public class App {

    public static void main(String[] args) throws ClassNotFoundException {

        //ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context = SpringApplication.run(App.class, args);
        InterfaceFactureController factureController = context.getBean(InterfaceFactureController.class);

        factureController.createFacture();

    }
}

