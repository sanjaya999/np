import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HeaderAndKeys {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            connection.connect();

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            int i = 0;
            while (true) {
                String headerKey = connection.getHeaderFieldKey(i);
                String headerValue = connection.getHeaderField(i);

                if (headerKey == null && headerValue == null) {
                    break;
                }

                if (headerKey != null) {
                    System.out.println(headerKey + ": " + headerValue);
                } else {
                    System.out.println("Status Line: " + headerValue);
                }

                i++;
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}