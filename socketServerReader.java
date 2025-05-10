import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class socketServerReader {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("localhost" , 9000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));


        String readServer =   reader.readLine();

        System.out.println(readServer);



    }
}
