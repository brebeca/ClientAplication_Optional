package org.example;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GameClinet gameClinet=new GameClinet();
        try{gameClinet.communicate() ;}catch (IOException e){System.out.println(e.getMessage());}
    }
}
