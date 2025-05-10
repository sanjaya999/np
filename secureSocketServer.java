import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class secureSocketServer {
    public static void main(String[] args) throws IOException {
        SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        ServerSocket ss = factory.createServerSocket(1422);
        Socket s = ss.accept();

        System.out.println(s + "Client Accepted and connected");
    }
}
