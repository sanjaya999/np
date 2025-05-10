import java.net.URLDecoder;

public class urlencodeDecode {
    public static void main(String[] args) {
        String encodedString = "u%40geeks+for+geeks";

        System.out.println("Encoded " + encodedString);

        System.out.println("Decoded "+ URLDecoder.decode(encodedString));
    }
}
