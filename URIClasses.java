import java.net.URI;
import java.net.URISyntaxException;

public class URIClasses {
    public static void main(String[] args) throws URISyntaxException {
        URI absolute = new URI("https://www.asm.edu.np");
        URI relative = new URI("/e-library/");

        URI resolved = absolute.resolve(relative);
        System.out.println("uri " + resolved);

    }
}
