import java.net.InetAddress;
import java.net.UnknownHostException;

public class hashcode {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip1 = InetAddress.getByName("www.facebook.com");
        int hashcode = ip1.hashCode();
        boolean multicast = ip1.isMulticastAddress();
        boolean isglobla = ip1.isMCGlobal();
        boolean mclocal = ip1.isMCOrgLocal();
        String ipStr = ip1.toString();

        System.out.println("hashcode" + hashcode);
        System.out.println("is multicast address: "  + multicast);
        System.out.println("is multicast global: " + isglobla);
        System.out.println("is multicast local: " + mclocal);
        System.out.println("ip to string: " + ipStr);

    }
}
