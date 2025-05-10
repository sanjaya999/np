import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class HeaderAll {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://google.com");
        URLConnection conn = url.openConnection();

        // Loop through header fields
        for (int i = 0; ; i++) {
            String headerKey = conn.getHeaderFieldKey(i);
            String headerValue = conn.getHeaderField(i);

            // Break the loop when there are no more headers
            if (headerKey == null && headerValue == null) {
                break;
            }

            System.out.println((headerKey != null ? headerKey + ": " : "") + headerValue);
        }
    }
}
