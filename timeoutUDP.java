import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class timeoutUDP {
    public static void main(String[] args) throws IOException {

        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer , buffer.length);

        DatagramSocket ds = new DatagramSocket(2048);
        ds.setSoTimeout(30000);

        ds.receive(dp);

        int timeout = ds.getSoTimeout();

        if (timeout > 0){

            System.out.println(ds + "will time out after" + timeout + "millisecond");

        }else if(timeout == 0){
            System.out.println(ds + "will not time out");

        }   


    }
}
