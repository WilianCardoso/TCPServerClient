import java.io.*;
import java.net.*;
import java.nio.Buffer;

public class ServidorTCP {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Servidor TCP esperando conexão...");
            
            Socket ClienteSocket = serverSocket.accept(); // 
            BufferedReader in = new BufferedReader(new InputStreamReader(ClienteSocket.getInputStream()));
            PrintWriter out = new PrintWriter(ClienteSocket.getOutputStream(), true);

            String mensagem = in.readLine(); //
            System.out.println("Mensagem recebida: " + mensagem);

            out.println("Mensagem recebida com sucesso!"); //

            ClienteSocket.close();
            serverSocket.close();
            
        } catch (Exception e) {
        }
    }
}
