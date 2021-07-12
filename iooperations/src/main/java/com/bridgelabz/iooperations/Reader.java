package com.bridgelabz.iooperations;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Reader {
    public static void main(String[] args) throws IOException {
          
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
          
        System.out.println("Enter the input string");
        String name = reader.readLine(); 
   
        System.out.println("You entered: " + name);         
    } 
}