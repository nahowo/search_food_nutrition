package nahowo.example.FoodNut.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nahowo.example.FoodNut.Domain.foodDocument;
import nahowo.example.FoodNut.Domain.foodnutrition;
import nahowo.example.FoodNut.Dto.FoodListResponse;
import nahowo.example.FoodNut.Repository.FoodRepositoryES;
import nahowo.example.FoodNut.Repository.FoodRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.client.elc.NativeQuery;
import org.springframework.data.elasticsearch.client.elc.NativeQueryBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class FoodService {
    private final FoodRepositoryJpa foodRepositoryJpa;
    private final FoodRepositoryES foodRepositoryES;

    public FoodListResponse searchJpa(String keyword) {
        List<foodnutrition> foods = foodRepositoryJpa.findByNameContainingOrManufacturerContaining(keyword, keyword);
        FoodListResponse foodListResponse = new FoodListResponse(foods, foods.size());
        return foodListResponse;
    }

    public FoodListResponse searchES(String keyword) {
        List<foodDocument> foods = foodRepositoryES.findByNameContainingOrManufacturerContaining(keyword, keyword);
        FoodListResponse foodListResponse = new FoodListResponse(foods, foods.size());
        return foodListResponse;
    }

}
