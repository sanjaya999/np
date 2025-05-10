import java.net.InetAddress;
import java.net.UnknownHostException;

public class isAnyLocalAddress {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip1 = InetAddress.getByName("www.facebook.com");


        System.out.println("isAnyLocalHost FB: " + ip1.isAnyLocalAddress() );

    }
}
