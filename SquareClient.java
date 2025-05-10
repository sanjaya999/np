import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SquareClient {
    public static void main(String[] args) {
        try {
            Socket connectToServer = new Socket( "localhost",9000 );
            System.out.println("connected with server");

            BufferedReader userReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(connectToServer.getOutputStream() , true);

            BufferedReader serverResponse = new BufferedReader(new InputStreamReader(connectToServer.getInputStream()));

            System.out.println("Enter:");
            String userInput = userReader.readLine();
            writer.println(userInput);


            String resServer = serverResponse.readLine();
            System.out.println("Server Response is  " + resServer);


            connectToServer.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
