package nmw.springframework.manualdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ManualDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ManualDiApplication.class, args);

	}

}
