import java.net.InetAddress;
import java.net.UnknownHostException;

public class getLoopbackAddress {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip1 = InetAddress.getLoopbackAddress();
        System.out.println("address is: " + ip1.getHostAddress());
    }
}
