package nahowo.example.FoodNut.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class FoodListResponse {
    private Integer count;
    private List<?> foodList;

    public FoodListResponse(List<?> foodList, Integer count) {
        this.foodList = foodList;
        this.count = count;
    }
}
