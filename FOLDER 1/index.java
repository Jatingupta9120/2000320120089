import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class index {
 public static void main(String[] args) throws IOException, InterruptedException {
 // Create the HTTP client
HttpClient client = HttpClient.newHttpClient();
// Create the HTTP request
HttpRequest request = HttpRequest.newBuilder()
.uri(URI.create("https://example.com/api"))
.build();
// Send the HTTP request
HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
// Print the HTTP request
System.out.println("HTTP request:");
System.out.println(request);
// Print the HTTP response
System.out.println("HTTP response:");
System.out.println(response);
// Print the time taken
long timeTaken = System.currentTimeMillis() - startTime;
System.out.println("Time taken: " + timeTaken + "ms");
}
}
