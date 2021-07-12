package com.bridgelabz.iooperations;

import java.util.Scanner; 

public class Scan
{ 
    public static void main(String args[]) 
    { 
        Scanner myscan = new Scanner(System.in); 
   
        System.out.println("Enter the input:");
        String mystr = myscan.nextLine(); 
        System.out.println("You entered a string:"+mystr); 
        System.out.println("Enter Next input:");  
        int num = myscan.nextInt();  
        System.out.println("You entered an integer:"+num); 
    } 
}