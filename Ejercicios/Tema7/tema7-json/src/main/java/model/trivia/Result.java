package model.trivia;

import static java.util.Collections.replaceAll;

@lombok.Data
public class Result {
    private String type;
    private String difficulty;
    private String category;
    private String question;
    private String correct_answer;
    private String[] incorrect_answers;

    public void limpiarHTML() {
        this.type = type.replaceAll("&[^;]+;", "");
        this.difficulty = difficulty.replaceAll("&[^;]+;", "");
        this.category = category.replaceAll("&[^;]+;", "");
        this.question = question.replaceAll("&[^;]+;", "");
        this.correct_answer = correct_answer.replaceAll("&[^;]+;", "");
        for (int i = 0; i < this.incorrect_answers.length; i++) {
            this.incorrect_answers[i] = incorrect_answers[i].replaceAll("&[^;]+;", "");
        }
    }

    public void mostrarPreguntaRespuesta() {
        System.out.println("Categoría = " + category);
        System.out.println("Pregunta = " + question);
        System.out.println("Respuesta correcta = " + correct_answer);
        System.out.println();
    }

}