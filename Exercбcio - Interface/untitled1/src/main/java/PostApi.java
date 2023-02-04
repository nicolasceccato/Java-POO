import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

public class PostApi {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {



     Transcript transcript = new Transcript();
     transcript.setAudio_url("https://www.youtube.com/watch?v=A_MjCqQoLLA");
     Gson gson = new Gson();
     String jsonRequest = gson.toJson(transcript);

     System.out.println(jsonRequest);

    HttpRequest postRequest = (HttpRequest) HttpRequest.newBuilder()
            .uri(new URI("https://api.assemblyai.com/v2/transcript"))
            .header("Authorization", "3d165fe0aed143a08d02ea9ca37ddb41")
            .POST(BodyPublishers.ofString("https://www.youtube.com/watch?v=9oq7Y8n1t00"))
            .build();

    HttpClient httpClient = HttpClient.newHttpClient();
    HttpResponse<String> postResponse =  httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
    System.out.println(postResponse.body());
    }


}