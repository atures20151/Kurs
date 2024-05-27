package by.vstu.avtosalon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "by.vstu.avtosalon")
@EntityScan(basePackages = "by.vstu.car.models")
@EnableJpaRepositories(basePackages = "by.vstu.avtosalon.repository")
@Configuration
public class AutoSalonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoSalonApplication.class, args);
	}

}
