package com.bridgelabz.iooperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo {
	 
public static void main(String[] args) throws IOException
{
 
BufferedReader input = null;
BufferedWriter output = null;
 
try {
input = new BufferedReader(new FileReader("input.txt"));
output = new BufferedWriter(new FileWriter("out1.txt"));
 
int c;
while ((c = input.read()) != -1) {
output.write(c);
}
} finally {
if (input != null) {
input.close();
}
if (output != null) {
output.close();
}
}
}
}
