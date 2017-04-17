package com.company;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Di on 17.04.2017.
 */
public class Sender extends Thread
{

    Socket socket;

    BufferedWriter bufferedWriter;

    public Sender(BufferedWriter writer) {
        bufferedWriter = writer;
    }

    @Override
    public void run() {

        try {


            String myMes = "";
            while (true)
            {
                Scanner scan= new Scanner(System.in);
                myMes = scan.nextLine();
                bufferedWriter.write(myMes + "\n");
                bufferedWriter.flush();
            }


        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }
}
