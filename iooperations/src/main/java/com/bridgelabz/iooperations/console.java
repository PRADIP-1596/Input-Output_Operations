package com.bridgelabz.iooperations;

public class console
{ 
    public static void main(String[] args)  
    {         
        System.out.println("Enter the input string");
        String name = System.console().readLine(); 
           
        System.out.println("You entered: " + name);         
    } 
}