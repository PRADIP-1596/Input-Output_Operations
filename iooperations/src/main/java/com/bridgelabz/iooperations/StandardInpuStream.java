package com.bridgelabz.iooperations;
public class StandardInpuStream  {
    public static void main(String args[]) throws java.io.IOException {
        int ch;
        System.out.println("Enter the character to be displayed : ");
 
       ch = System.in.read();
        System.out.println("You entered : " + (char)ch);
     
    }
}