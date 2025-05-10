import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serverSocketV2 {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9000);
        Socket s = ss.accept();

        PrintWriter writer = new PrintWriter(s.getOutputStream() , true);
        writer.println("hello");
        writer.println("bye");
        ss.close();
        s.close();

    }
}
