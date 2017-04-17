package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {


    public static RegisterSocketThread registerSocketThread;


    public static void main(String[] args) {
	// write your code here

        try {
            ServerSocket serverSocket = new ServerSocket(5556);

            Socket socket = serverSocket.accept(); // set connection

//            registerSocketThread = new RegisterSocketThread();
//            registerSocketThread.start();

//            Socket socket = registerSocketThread.getSocket();



            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));


            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));

            Lisener lisener = new Lisener(bufferedReader);
            lisener.start();

            Sender sender = new Sender(bufferedWriter);
            sender.start();








            Socket socket2 = serverSocket.accept();

            BufferedReader bufferedReader2 =
                    new BufferedReader(new InputStreamReader(socket2.getInputStream()));


            BufferedWriter bufferedWriter2 = new BufferedWriter(
                    new OutputStreamWriter(socket2.getOutputStream()));

            Lisener lisener2 = new Lisener(bufferedReader2);
            lisener2.start();

            Sender sender2 = new Sender(bufferedWriter2);
            sender2.start();

        }
        catch (IOException ex)
        {

            ex.printStackTrace();
        }

    }
}
