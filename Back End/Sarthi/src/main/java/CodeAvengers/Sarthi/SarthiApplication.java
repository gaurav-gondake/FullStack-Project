package CodeAvengers.Sarthi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class SarthiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SarthiApplication.class, args);
	}

}
