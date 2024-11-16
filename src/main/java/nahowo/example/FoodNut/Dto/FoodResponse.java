package nahowo.example.FoodNut.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import nahowo.example.FoodNut.Domain.foodnutrition;

@NoArgsConstructor
@Getter
public class FoodResponse {
    private String name;
    private Double carbohydrate;
    private String manufacturer;

    public FoodResponse(foodnutrition food) {
        this.name = food.getName();
        this.carbohydrate = food.getCarbohydrate();
        this.manufacturer = food.getManufacturer();
    }
}
