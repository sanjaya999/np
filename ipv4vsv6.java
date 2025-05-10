import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipv4vsv6 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] ip1 = InetAddress.getAllByName("www.facebook.com");
        System.out.println(ip1);

        for (int i = 0; i < ip1.length; i++) {
            if(ip1[i] instanceof Inet4Address){

                System.out.println("this is ipv4 : " + ip1[i]);
            }else{
                System.out.println("this is ipv6: " + ip1[i]);
            }
        }





    }
}
