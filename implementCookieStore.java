import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class implementCookieStore {
    public static void main(String[] args) {

        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();

        HttpCookie cookieA = new HttpCookie("c1" , "ram");
        HttpCookie cookieB = new HttpCookie("c2" , "sita");

        URI uri = URI.create("https://test.com/");

        cookieStore.add(uri, cookieA);
        cookieStore.add(uri , cookieB);

        List<HttpCookie> stored = cookieStore.get(uri);
        System.out.println(stored);

        cookieStore.remove(uri , cookieB);

        List<HttpCookie> afterRemoved = cookieStore.getCookies();
        System.out.println(afterRemoved);


    }
}
