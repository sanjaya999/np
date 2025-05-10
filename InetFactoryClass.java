import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetFactoryClass {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println("localhost: " + ip1);

        InetAddress ip2 = InetAddress.getByName("www.youtube.com");
        System.out.println("youtube: " + ip2 );

        InetAddress ip3[] = InetAddress.getAllByName("www.google.com");
        for(int i= 0 ; i<ip3.length ; i++){
            System.out.println("all address: " + ip3[i]);
        }

    }
}
