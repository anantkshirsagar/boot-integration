package in.sb.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "in.sb" })
@SpringBootApplication
public class BootIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootIntegrationApplication.class, args);
	}
}
