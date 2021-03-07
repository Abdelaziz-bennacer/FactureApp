package fr.abdel;

import fr.abdel.controller.InterfaceFactureController;
import fr.abdel.service.InterfaceFactureService;
import fr.abdel.service.prefix.FactureServicePrefix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"fr.abdel.controller.web", /*"fr.abdel.service.prefix",*/ "fr.abdel.repository.database"})
@PropertySource("classpath:application.properties")
public class App {

    public static void main(String[] args) throws ClassNotFoundException {

        //ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        InterfaceFactureController factureController = context.getBean(InterfaceFactureController.class);

        factureController.createFacture();

    }

    @Bean
    public InterfaceFactureService configureFactureService(){
       return new FactureServicePrefix();
    }
}