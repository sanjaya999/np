import java.net.InetAddress;
import java.net.UnknownHostException;

public class javainetEquals {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip1 = InetAddress.getByName("www.google.com");
        InetAddress ip2 = InetAddress.getByName("www.youtube.com");

        if(ip1.equals(ip2)){
            System.out.println("IP are equal");
        }else{
            System.out.println("IP are not equal");
        }



    }
}
