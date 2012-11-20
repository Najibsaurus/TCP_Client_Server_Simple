
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            Socket server = new Socket("localhost", 1234);
            BufferedReader masuk = new BufferedReader(new InputStreamReader(server.getInputStream()));
            System.out.println("Server : " + masuk.readLine());
            masuk.close();
            server.close();
        } catch (Exception e) {
            System.out.println("Gagal.coba lagi");
        }


    }
}
