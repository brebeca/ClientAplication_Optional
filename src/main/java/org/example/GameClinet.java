package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GameClinet {

    String serverAddress = "127.0.0.1";
    int PORT = 8000;

    /**
     *se face conexiunea cu serverul
     * se initialiseaza clasele pt citire si scriere din socket
     * intr o bucla while se citesteste input de la utiliszator pe care il scrie in socket
     * apoi citeste raspunsul si il afiseaza
     * @throws IOException
     */
   public void communicate() throws IOException {
     try (
        Socket socket = new Socket(serverAddress, PORT);
        PrintWriter out =new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader ( new InputStreamReader(socket.getInputStream())) )
     {
         Scanner myObj = new Scanner(System.in);
         System.out.println("Enter a command");
         String request="";
         while(!request.contains("exit")) {

             request = myObj.nextLine();
             out.println(request);
             String response = in.readLine();
             System.out.println(response);
         }
        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }
}

        }



