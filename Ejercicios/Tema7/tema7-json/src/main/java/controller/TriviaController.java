package controller;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.trivia.Questions;
import model.trivia.Result;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class TriviaController {

    public Result[] preguntas;

    public void importarDatos() {
        try {
            URL url = new URL("https://opentdb.com/api.php?amount=3&type=multiple");
            ObjectMapper objectMapper = new ObjectMapper();
            preguntas = objectMapper.readValue(url, Questions.class).getResults();
            for (Result pregunta : preguntas) {
                pregunta.limpiarHTML();
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrarDatos() {
        for (Result pregunta : preguntas) {
            pregunta.mostrarPreguntaRespuesta();
        }
    }

}