import java.net.MalformedURLException;
import java.net.URL;

public class urlIBIBILO {
    public static void main(String[] args) throws MalformedURLException {
        URL ib1 = new URL("http://www.ibiblio.org");
        URL ib2 = new URL("http://ibiblio.org");

        if (ib1.equals(ib2)){
            System.out.println("these are equal");
        }else{
            System.out.println("these are not equal");
        }
    }
}
