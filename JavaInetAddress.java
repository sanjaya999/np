import java.net.InetAddress;
import java.net.UnknownHostException;

public class JavaInetAddress {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("ip: " + ip); //get both name and host
            System.out.println("Host name: " + ip.getHostName()); //get host name
            System.out.println("Ip address: " + ip.getHostAddress()); //get host ipaddress

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
