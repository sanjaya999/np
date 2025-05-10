import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class getHeader {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://google.com");

        URLConnection conn = url.openConnection();

        Map<String , List<String>> headerFields = conn.getHeaderFields();

        Set<String> keys = headerFields.keySet();

        for(String Key : keys){
            List<String> values = headerFields.get(keys);
            System.out.println(keys + "");

            for(String value : values){
                System.out.println(value + " ");
            }
            System.out.println();

        }

        


    }
}
