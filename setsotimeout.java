import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class setsotimeout {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9000)) {
            socket.setSoTimeout(5000); // Set timeout to 5 seconds
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("Hello, Server!");

            try {
                String response = in.readLine();
                System.out.println("Server Response: " + response);
            } catch (SocketTimeoutException e) {
                System.err.println("Read timed out");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
