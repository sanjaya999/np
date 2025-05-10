import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class socketServer {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("time.nist.gov" , 13);
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

        int line;
        while (( line = reader.read()) != -1){
            System.out.print((char) line);
        }
    }
}
