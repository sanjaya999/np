import java.net.*;
import java.util.Enumeration;

public class factorymethod {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println("Interface Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());

                // Get all IP addresses for this interface
                Enumeration<InetAddress> addresses = ni.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress ip = addresses.nextElement();
                    System.out.println("  IP Address: " + ip.getHostAddress());
                }

                System.out.println("-------------------------------");
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
