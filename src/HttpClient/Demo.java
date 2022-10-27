package HttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {

        
        // try {
            final String MY_URL = "https://postman-echo.com/get";
            HttpRequest request ;
            request = HttpRequest.newBuilder()
                                            .GET()
                                            .header("accept", "application/json")
                                            .uri(URI.create(MY_URL))
                                            .build();
            HttpResponse<String> client;
            client = HttpClient.newBuilder().build().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(client.body());
        // } catch (URISyntaxException e1) {
        //     // TODO Auto-generated catch block
        //     e1.printStackTrace();
        // }

        
}
}