import java.net.CookieManager;
import java.net.CookiePolicy;

public class acceptOriginalCookie {
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();

        manager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        System.out.println("cookie policy set to original server");
    }
}
