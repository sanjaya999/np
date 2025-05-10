import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class cookie {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();

        // Creating cookies and URI
        HttpCookie cookieA = new HttpCookie("c1", "ram");
        HttpCookie cookieB = new HttpCookie("c2", "sita");

        URI url1 = URI.create("https://test1.com/");

        // Add cookies into CookieStore
        cookieStore.add(url1, cookieA);
        cookieStore.add(url1, cookieB);

        // Read stored all cookies
        List<HttpCookie> cookieList = cookieStore.getCookies();
        System.out.println("Cookies list in CookieStore: " + cookieList + "\n");

        // Remove cookie of url
        cookieStore.remove(url1, cookieA);
        List<HttpCookie> remainingCookieList = cookieStore.getCookies();
        System.out.println("Remaining Cookies: " + remainingCookieList + "\n");

    }
}