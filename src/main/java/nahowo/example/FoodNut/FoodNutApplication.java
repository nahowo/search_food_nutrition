package nahowo.example.FoodNut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:env.properties")
@SpringBootApplication
public class FoodNutApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodNutApplication.class, args);
	}

}
