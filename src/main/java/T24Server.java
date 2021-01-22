import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class T24Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(80);
        Socket s=ss.accept();
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        try {
            dout.writeUTF("Hello Server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
