import java.net.*;

public class url {
    public static void main(String[] args) {
        try {
            // Example URL
            URL url = new URL("https://www.example.com:8080/index.html?user=123");

            // Extracting parts of the URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
            System.out.println("Query: " + url.getQuery());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
