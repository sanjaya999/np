import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class httpURL {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://google.com");

        HttpURLConnection urlcon = (HttpURLConnection) url.openConnection();

        InputStream stream = urlcon.getInputStream();

        for(int i = 1 ; i<=8 ; i++){
            System.out.println(urlcon.getHeaderFieldKey(i) + " =" + urlcon.getHeaderField(i));
        }
        urlcon.disconnect();

    }
}
