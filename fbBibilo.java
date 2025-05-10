import java.net.InetAddress;
import java.net.UnknownHostException;

public class fbBibilo {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip1 = InetAddress.getByName("www.ibiblio.org");
        InetAddress ip2 = InetAddress.getByName("www.facebook.com");
        String ipI = ip1.getHostAddress();
        String ipF = ip2.getHostAddress();


        System.out.println("ibiblio " + ipI);
        System.out.println("facebook "+ ipF);

        if(ipF.equals(ipI)){
            System.out.println("Both ip are same");
        }else{
            System.out.println("Both ip are not same");
        }

    }
}
