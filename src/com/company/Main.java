package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {
            ServerSocket serverSocket = new ServerSocket(5556);
            Socket socket = serverSocket.accept(); // set connection

            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));


            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));

            Lisener lisener = new Lisener(bufferedReader);
            lisener.start();

            Sender sender = new Sender(bufferedWriter);
            sender.start();


        }
        catch (IOException ex)
        {

            ex.printStackTrace();
        }

    }
}
