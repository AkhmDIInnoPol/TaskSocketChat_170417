package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Di on 17.04.2017.
 */
public class Lisener extends Thread
{

    BufferedReader bufferedReader;



    public Lisener(BufferedReader reader)
    {
       bufferedReader = reader;
    }

    @Override
    public void run() {
        String msg = null;
        try {

            while ((msg= bufferedReader.readLine()) != null) {
                System.out.println("in second cycle");
                System.out.println(msg + "\n");
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
