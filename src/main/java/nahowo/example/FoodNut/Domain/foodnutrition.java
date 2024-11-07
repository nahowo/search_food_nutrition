package nahowo.example.FoodNut.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "foodnutrition")
public class foodnutrition {
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "per")
    private Integer per;

    @Column(name = "energy(kcal)")
    private Integer energy;

    @Column(name = "protein(g)")
    private Double protein;

    @Column(name = "fat(g)")
    private Double fat;

    @Column(name = "carbohydrate(g)")
    private Double carbohydrate;

    @Column(name = "sugar(g)")
    private Double sugar;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "producer")
    private String producer;

}
