import java.net.URI;
import java.net.URISyntaxException;

public class urlClass {
    public static void main(String[] args) throws URISyntaxException {
        URI uri = new URI("https://google.com");

        System.out.println("authority " + uri.getAuthority() );
        System.out.println("fragment " + uri.getFragment());
        System.out.println("host" + uri.getHost());
        System.out.println("scheme "+ uri.getScheme());
    }
}
