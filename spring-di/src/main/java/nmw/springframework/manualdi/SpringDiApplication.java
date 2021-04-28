package nmw.springframework.manualdi;

import nmw.springframework.manualdi.controller.ConstructorInjectedController;
import nmw.springframework.manualdi.controller.PropertyInjectedController;
import nmw.springframework.manualdi.controller.SetterInjectController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);

		System.out.println("------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("------Setter");
		SetterInjectController setterInjectController = (SetterInjectController) applicationContext.getBean("setterInjectController");
		System.out.println(setterInjectController.getGreeting());


	}

}
