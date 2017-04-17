package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Di on 17.04.2017.
 */
public class RegisterSocketThread extends Thread
{
    private  ServerSocket serverSocket;
    private  Socket socket;



    public RegisterSocketThread() {
        try {
            serverSocket = new ServerSocket(5556);
            socket = serverSocket.accept();
        }
            catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }


    @Override
    public void run() {
        while (true)
        {
            try {
                socket = serverSocket.accept(); // set connection
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }

    public  Socket getSocket()
    {
        try {
            return serverSocket.accept();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }



}
