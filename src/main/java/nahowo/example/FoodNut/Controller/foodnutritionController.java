package nahowo.example.FoodNut.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import nahowo.example.FoodNut.Domain.foodDocument;
import nahowo.example.FoodNut.Domain.foodnutrition;
import nahowo.example.FoodNut.Dto.FoodListResponse;
import nahowo.example.FoodNut.Dto.ResultResponse;
import nahowo.example.FoodNut.Service.FoodService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Tag(name = "식품정보", description = "식품정보 관련 API입니다. ")
@RequestMapping("/api/v1/foodnutrition")
public class foodnutritionController {
    private final FoodService foodService;

    @Operation(summary = "식품정보 검색: JPA Query", description = "식품의 이름과 제조사를 JPA로 검색하는 API입니다. ")
    @GetMapping("/search/jpa")
    public ResponseEntity<ResultResponse> searchJpa(@RequestParam String keyword) {
        FoodListResponse foods = foodService.searchJpa(keyword);
        return ResponseEntity.ok(ResultResponse.of("JPA를 활용한 검색 완료", foods));
    }

    @Operation(summary = "식품정보 검색: ElasticSearch", description = "식품의 이름과 제조사를 ElasticSearch로 검색하는 API입니다. ")
    @GetMapping("/search/es")
    public ResponseEntity<ResultResponse> searchEs(@RequestParam String keyword) {
        FoodListResponse foods = foodService.searchES(keyword);
        return ResponseEntity.ok(ResultResponse.of("ES를 활용한 검색 완료", foods));
    }
}
