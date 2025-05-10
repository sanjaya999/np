import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SquareServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverS = new ServerSocket( 9000 );
            Socket socket = serverS.accept();
            System.out.println("connected with client" + socket.getInetAddress());


            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter responseWriter = new PrintWriter(socket.getOutputStream() , true);

            int s = Integer.parseInt(reader.readLine());
            System.out.println("recieved from client" + s);


            responseWriter.println(s*s); //send to client

            socket.close();
            serverS.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
