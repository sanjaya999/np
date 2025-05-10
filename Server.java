import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverS = new ServerSocket( 9000 );
            System.out.print("waiting for client");
            Socket socket = serverS.accept();
            System.out.println("connected with client" + socket.getInetAddress());
            socket.close();
            serverS.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
