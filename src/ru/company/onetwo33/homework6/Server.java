package ru.company.onetwo33.homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public Server() {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void init() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8189);
        System.out.println("Сервер запущен, ожидаем подключения...");
        socket = serverSocket.accept();
        System.out.println("Клиент подключился");
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (true) {
                    String strFromClient = in.readUTF();
                    if (strFromClient.equalsIgnoreCase("/end")) closeConnection();
                    System.out.println(strFromClient);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void closeConnection() {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startServer() {
        new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            try {
                while (true) {
                    String strToClient = scanner.nextLine();
                    if (strToClient.equals("/end")) {
                        out.writeUTF(strToClient);
                        closeConnection();
                    }
                    out.writeUTF(strToClient);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
