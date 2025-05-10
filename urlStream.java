import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class urlStream {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://facebook.com");
            URLConnection urlcon = url.openConnection();
            InputStream is = urlcon.getInputStream();

            int i;
            while ((i = is.read()) != -1) { // Read byte-by-byte until the end
                System.out.print((char) i); // Print characters
            }

            is.close(); // Close the stream
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading from URL: " + e.getMessage());
        }
    }
}
