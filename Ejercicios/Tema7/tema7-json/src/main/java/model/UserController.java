package model;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class UserController {
    private User user;

    public UserController() {
        user = null;
    }

    public void importUser() {
        try {
            URL url = new URL("https://randomuser.me/api/");
            ObjectMapper objectMapper = new ObjectMapper();
            User user = objectMapper.readValue(url, User.class);
            this.user = user;
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

    public void printUserInfo() {
        String titulo = user.getResults()[0].getName().getTitle();
        String nombre = user.getResults()[0].getName().getFirst();
        String apellido = user.getResults()[0].getName().getLast();
        System.out.printf("Nombre completo: %s %s %s%n", titulo, nombre, apellido);
        String email = user.getResults()[0].getEmail();
        System.out.printf("Email: %s%n", email);
        String pais = user.getResults()[0].getLocation().getCountry();
        System.out.printf("País: %s%n", pais);
    }

}
