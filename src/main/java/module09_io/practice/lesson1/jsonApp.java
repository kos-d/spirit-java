package module09_io.practice.lesson1;

import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class jsonApp {
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        String urlPath = "http://jsonplaceholder.typicode.com/posts";
        
        String json = sendRequest(urlPath);
        
        Gson gson = new Gson();
        
        Model[] result = gson.fromJson(json, Model[].class);
        
        for (Model model : result) {
            System.out.println(model);
        }
    }
    
    public static String sendRequest(String urlPath) throws MalformedURLException, IOException {
        URL url = new URL(urlPath);
        
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestProperty("accept", "application/json");
        
        try (Scanner sc = new Scanner(new BufferedInputStream(connection.getInputStream()))) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNext()) sb.append(sc.nextLine());
            return sb.toString();
        }
    }
}

class Model {
    private Integer id;
    private Integer userId;
    private String title;
    private String body;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Model{" + "id=" + id + 
                ", userId=" + userId + 
                ", title=" + title + 
                ", body=" + body + '}';
    }
    
    
}