package controller;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.PlaceholderPost;
import model.PlaceholderUser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class PlaceholderController {

    private PlaceholderUser user;

    public PlaceholderPost importPost() {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(url, PlaceholderPost.class);
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

    public PlaceholderUser importUser() {
        PlaceholderPost post = importPost();
        long id = post.getId();
        try {
            URL url = new URL(String.format("https://jsonplaceholder.typicode.com/users/%s", id));
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(url, PlaceholderUser.class);
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

    public void printInfo() {
        System.out.println("Título del post = " + importPost().getTitle());
        System.out.println("Nombre de usuario = " + importUser().getUsername());
        System.out.println("Ciudad del usuario = " + importUser().getCity());
    }
}
