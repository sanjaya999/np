import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket serverS = new Socket( "localhost",9000 );
            System.out.println("connected with server");

            serverS.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
