import java.net.CookieManager;
import java.net.CookiePolicy;

public class acceptAllCookies {
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();

        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        System.out.println("cookie policy set to all");
    }
}
