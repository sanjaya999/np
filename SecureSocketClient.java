import javax.net.SocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.Socket;

public class SecureSocketClient {
    public static void main(String[] args) throws IOException {
        SocketFactory factory = SSLSocketFactory.getDefault();
        Socket s = factory.createSocket("localhost" , 1422);
        System.out.println("connected " + s);
        s.close();
    }
}
