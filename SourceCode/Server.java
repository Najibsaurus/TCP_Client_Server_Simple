import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
       String pesan = "Dinosaurus..! ";
        try {
            ServerSocket server = new ServerSocket(1234);
            System.out.println("Server Konek... port 1234");
            Socket klien = server.accept(); //listening
            PrintWriter keluar = new PrintWriter(klien.getOutputStream(), true);
            keluar.printf(pesan);
            keluar.close();
            server.close();
            klien.close();
        } catch (Exception e) {
            System.out.println("Gagal.. coba lagi");
        }
    }
}
