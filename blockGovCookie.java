import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;

public class blockGovCookie {
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();

        manager.setCookiePolicy(new CookiePolicy() {
            @Override
            public boolean shouldAccept(URI uri, HttpCookie cookie) {
                String host = uri.getHost().toLowerCase();
                return !host.endsWith(".gov");
            }
        });

        java.net.CookieHandler.setDefault(manager);
        System.out.println(".gov cookie blocked");
    }
}
