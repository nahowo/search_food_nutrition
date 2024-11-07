package nahowo.example.FoodNut.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nahowo.example.FoodNut.Domain.foodnutrition;
import nahowo.example.FoodNut.Repository.FoodRepositoryJpa;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class FoodService {
    private final FoodRepositoryJpa foodRepositoryJpa;
    public List<foodnutrition> searchJpa(String keyword) {
        List<foodnutrition> foods = foodRepositoryJpa.findByNameContainingOrManufacturerContaining(keyword, keyword);
        return foods;
    }
}
