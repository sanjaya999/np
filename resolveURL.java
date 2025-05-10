import java.net.URI;
import java.net.URISyntaxException;

public class resolveURL {
    public static void main(String[] args) throws URISyntaxException {
        URI absolute = new URI("http://www.google.com");
        URI relative = new URI("image/photo123");

        System.out.println(absolute.resolve(relative));

    }
}
