package internet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCPServer {

    public static void main(String[] args) throws IOException {
        // 在本机9999端口监听, 等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server is listen to 9999");
        // 没有客户端连接时, 程序会阻塞, 等待连接
        // 如果有客户端连接则返回socket对象, 程序继续
        Socket socket = serverSocket.accept();
        System.out.println("Socket = " + socket.getClass());
    }

}
