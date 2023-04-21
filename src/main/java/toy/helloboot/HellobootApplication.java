package toy.helloboot;

import org.springframework.boot.SpringApplication;
import toy.config.MySpringBootApplication;

@MySpringBootApplication
public class HellobootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class, args);
	}
}
