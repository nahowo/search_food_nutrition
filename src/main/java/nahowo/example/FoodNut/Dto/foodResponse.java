package nahowo.example.FoodNut.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import nahowo.example.FoodNut.Domain.foodnutrition;

@NoArgsConstructor
@Getter
public class foodResponse {
    private String code;
    private String name;
    private Integer per;
    private Integer energy;
    private Double protein;
    private Double fat;
    private Double carbohydrate;
    private Double sugar;
    private Integer weight;
    private String manufacturer;
    private String producer;

    public foodResponse(foodnutrition food) {
        this.code = food.getCode();
        this.name = food.getName();
        this.per = food.getPer();
        this.energy = food.getEnergy();
        this.protein = food.getProtein();
        this.fat = food.getFat();
        this.carbohydrate = food.getCarbohydrate();
        this.sugar = food.getSugar();
        this.weight = food.getWeight();
        this.manufacturer = food.getManufacturer();
        this.producer = food.getProducer();
    }
}
