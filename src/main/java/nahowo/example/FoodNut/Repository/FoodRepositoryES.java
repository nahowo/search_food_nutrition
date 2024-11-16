package nahowo.example.FoodNut.Repository;

import nahowo.example.FoodNut.Domain.foodDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface FoodRepositoryES extends ElasticsearchRepository<foodDocument, String> {
    List<foodDocument> findByNameContainingOrManufacturerContaining(String name, String manufacturer);
}
