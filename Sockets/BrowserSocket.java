import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BrowserSocket {

    public static void main(String[] args) {

        while (true) {

            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(55555); //Open localhost:55555 to see output
            } catch (IOException e) {
                System.err.println("Could not listen on port: 55555.");
                System.exit(1);
            }

            Socket clientSocket = null;
            try {
                clientSocket = serverSocket.accept();

                if (clientSocket != null)
                    System.out.println("Connected");

            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }

            PrintWriter out = null;
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }


            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html");
            out.println("\r\n");
            out.println("<p> <H1>Hello world</H1> </p>");
            out.println("<img src=\"https://cdn.schoolstickers.com/products/en/819/GREEN-SMILE-00.png\" alt=\"Smiley face\" height=\"402\" width=\"402\">");
            out.flush();

            out.close();

            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
