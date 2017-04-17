package com.company;

import java.io.*;
import java.net.Socket;

/**
 * Created by Di on 17.04.2017.
 */
public class Client
{


    public static void main(String[] args)  {
        try {
            Socket socket = new Socket("localhost", 5556);
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Sender sender = new Sender(bufferedWriter);
            sender.start();

            Lisener lisener = new Lisener(bufferedReader);
            lisener.start();



//            socket.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }


    }



}
