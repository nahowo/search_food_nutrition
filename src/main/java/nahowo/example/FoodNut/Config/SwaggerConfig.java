package nahowo.example.FoodNut.Config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info((apiInfo()));
    }

    private Info apiInfo() {
        return new Info()
                .title("Food Nutrition API")
                .description("[ Base URL: http://localhost:8080/api/v1 ]\n\nFoodnutrition의 API 문서")
                .version("1.0.0");
    }
}
