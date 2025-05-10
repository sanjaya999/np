import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.InetSocketAddress;

public class CipherSuites {
    public static void main(String[] args) throws IOException {
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket secureSocket = (SSLSocket) factory.createSocket();

        // Connect to server
        secureSocket.connect(new InetSocketAddress("www.google.com", 443));

        // Start SSL handshake
        secureSocket.startHandshake();

        // Print enabled cipher suites
        System.out.println("Enabled Cipher Suites:");
        for (String suite : secureSocket.getEnabledCipherSuites()) {
            System.out.println(suite);
        }

        // Print supported cipher suites
        System.out.println("\nSupported Cipher Suites:");
        for (String suite : secureSocket.getSupportedCipherSuites()) {
            System.out.println(suite);
        }

        // Close the socket
        secureSocket.close();
    }
}
