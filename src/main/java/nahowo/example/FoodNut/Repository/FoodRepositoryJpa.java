package nahowo.example.FoodNut.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import nahowo.example.FoodNut.Domain.foodnutrition;

import java.util.List;

public interface FoodRepositoryJpa extends JpaRepository<foodnutrition, String> {
    List<foodnutrition> findByNameContainingOrManufacturerContaining(String name, String manufacturer);
    List<foodnutrition> findByName(String name);
}
