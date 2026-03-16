package model.trivia;

@lombok.Data
public class Questions {
    private long response_code;
    private Result[] results;
}