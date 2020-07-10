package guru.springframework.sfgdi_09072020;

import guru.springframework.sfgdi_09072020.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi_09072020.controllers.MyController;
import guru.springframework.sfgdi_09072020.controllers.PropertyInjectedController;
import guru.springframework.sfgdi_09072020.controllers.SetterBasedController;
import guru.springframework.sfgdi_09072020.services.ConstructorInjectedGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDi09072020Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDi09072020Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");

		System.out.println(myController.sayHello());
		System.out.println(constructorInjectedController.getGreeting());
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println(setterBasedController.getGreeting());
	}

}
