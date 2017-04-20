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
            
            Version(outStream);
            HLen(outStream);
            TOS(outStream);
            Length(outStream);
            Ident(outStream);
            Flags(outStream);
            Offset(outStream);
            TTL(outStream);
            Protocol(outStream);
            Checksum(outStream);
            SourceAddr(outStream);
            DestinationAddr(outStream);
            Data(outStream);

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void Version(OutputStream outStream) {
    }

    private static void HLen(OutputStream outStream) {
    }

    private static void TOS(OutputStream outStream) {
    }

    private static void Length(OutputStream outStream) {
    }

    private static void Ident(OutputStream outStream) {
    }

    private static void Flags(OutputStream outStream) {
    }

    private static void Offset(OutputStream outStream) {
    }

    private static void TTL(OutputStream outStream) {
    }

    private static void Protocol(OutputStream outStream) {
    }

    private static void Checksum(OutputStream outStream) {
    }

    private static void SourceAddr(OutputStream outStream) {
    }

    private static void DestinationAddr(OutputStream outStream) {
    }

    private static void Data(OutputStream outStream) {
    }
}
