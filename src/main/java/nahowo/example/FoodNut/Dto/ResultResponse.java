package nahowo.example.FoodNut.Dto;

import lombok.Getter;

@Getter
public class ResultResponse {
    private String message;
    private Object data;

    public ResultResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public static ResultResponse of(String message, Object data) {
        return new ResultResponse(message, data);
    }
}
