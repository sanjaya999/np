import java.net.CookieManager;
import java.net.CookiePolicy;

public class acceptNoCookies {
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();

        manager.setCookiePolicy(CookiePolicy.ACCEPT_NONE);
        System.out.println("cookie policy set to none");
    }
}
