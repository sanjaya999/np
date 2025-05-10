import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class urlHeaderViewer {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.com");

        URLConnection conn = url.openConnection();

        String header = conn.getContentType();
        System.out.println("header" + header);

        int contentLength = conn.getContentLength();
        System.out.println("content length " + contentLength);

        String contentEncoding = conn.getContentEncoding();
        System.out.println("encoding " + contentEncoding);

        long contentLong = conn.getContentLengthLong();
        System.out.println("content long" + contentLong);

        long dateInMils = conn.getDate();
        System.out.println("dat in milisecond" + dateInMils);

        long expireInMils = conn.getExpiration();
        System.out.println("expire date in mils" + expireInMils);

        Date expireDate = new Date(expireInMils);
        System.out.println("new date expire " + expireDate);

        long lastModified = conn.getLastModified();
        Date convertLastModified = new Date(lastModified);
        System.out.println("last modified" + convertLastModified);

    }
}
