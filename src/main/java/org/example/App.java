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
        System.out.print("Optionui : 1. create  2.join 3.submit:ij , unde i este linia si j coloana ");
        GameClinet gameClinet=new GameClinet();
        try{gameClinet.communicate() ;}catch (IOException e){System.out.println(e.getMessage());}
    }
}
