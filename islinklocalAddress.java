import java.net.InetAddress;
import java.net.UnknownHostException;

public class islinklocalAddress {
    public static void main(String[] args)  throws UnknownHostException {
        InetAddress ip1 = InetAddress.getByName("www.google.com");
        System.out.println("islinkAddress google: "+ip1.isLinkLocalAddress());

    }
}
