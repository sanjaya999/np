import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket serverConnection = new Socket("localhost", 9000);
            System.out.println("Connected to server. Type 'exit' to quit.");

            BufferedReader userReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(serverConnection.getOutputStream(), true);
            BufferedReader serverResponse = new BufferedReader(new InputStreamReader(serverConnection.getInputStream()));

            String userInput;
            while (true) {
                System.out.print("You: ");
                userInput = userReader.readLine();

                writer.println(userInput);
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                String response = serverResponse.readLine();
                System.out.println(response);
            }

            serverConnection.close();
            System.out.println("Disconnected from server.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
