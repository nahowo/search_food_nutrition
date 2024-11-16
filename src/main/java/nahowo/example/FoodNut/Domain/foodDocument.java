package nahowo.example.FoodNut.Domain;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Document(indexName = "foodnutrition")
public class foodDocument {

    @Id
    @Field(name = "code", type = FieldType.Text)
    private String code;

    @MultiField(
            mainField = @Field(name = "name", type = FieldType.Text, analyzer = "nori"),
            otherFields = {@InnerField(suffix = "keyword",type = FieldType.Keyword, ignoreAbove = 256)
    })
    private String name;

    @MultiField(
            mainField = @Field(name = "manufacturer", type = FieldType.Text, analyzer = "nori"),
            otherFields = {@InnerField(suffix = "keyword",type = FieldType.Keyword, ignoreAbove = 256)
            })
    private String manufacturer;

    @Field(name = "per", type = FieldType.Long)
    private Integer per;

    @Field(name = "energy(kcal)", type = FieldType.Long)
    private Integer energy;

    @Field(name = "protein(g)", type = FieldType.Float)
    private Double protein;

    @Field(name = "fat(g)", type = FieldType.Float)
    private Double fat;

    @Field(name = "carbohydrate(g)", type = FieldType.Float)
    private Double carbohydrate;

    @Field(name = "sugar(g)", type = FieldType.Float)
    private Double sugar;

    @Field(name = "weight", type = FieldType.Long)
    private Integer weight;

    @Field(name = "producer", type = FieldType.Text)
    private String producer;
}
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Builder
//@Document(indexName = "foodnutrition")
//public class foodDocument {
//    @Id
//    @Field(name = "code", type = FieldType.Text)
//    private String code;
//
//    @Field(name = "name", type = FieldType.Text, analyzer = "nori_analyzer")
//    private String name;
//
//    @Field(name = "per", type = FieldType.Long)
//    private Integer per;
//
//    @Field(name = "energy(kcal)", type = FieldType.Long)
//    private Integer energy;
//
//    @Field(name = "protein(g)", type = FieldType.Float)
//    private Double protein;
//
//    @Field(name = "fat(g)", type = FieldType.Float)
//    private Double fat;
//
//    @Field(name = "carbohydrate(g)", type = FieldType.Float)
//    private Double carbohydrate;
//
//    @Field(name = "sugar(g)", type = FieldType.Float)
//    private Double sugar;
//
//    @Field(name = "weight", type = FieldType.Long)
//    private Integer weight;
//
//    @Field(name = "manufacturer", type = FieldType.Text, analyzer = "nori_analyzer")
//    private String manufacturer;
//
//    @Field(name = "producer", type = FieldType.Text)
//    private String producer;
//}
