/**
 * Created by Narvik on 4/20/17.
 */
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class Ipv4Client {
    public static void main ( String [] args ){

        try (Socket socket = new Socket("codebank.xyz", 38003)) {

            InputStream getIS = socket.getInputStream();
            OutputStream outStream = socket.getOutputStream();



        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
