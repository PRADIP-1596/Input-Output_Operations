package com.bridgelabz.iooperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileDemo {
		 
		public static void main(String[] args) throws IOException {
		 
		File newfile=new File("created.txt");
		 
		if(!newfile.exists()) {
		newfile.createNewFile();
		 
		System.out.println("file not exist");
		 
		}
		 
		try {
		 
		String FILENAME="created.txt";
		String content="hi how are u";
		 
		FileWriter fwt = new FileWriter(FILENAME);
		BufferedWriter bwt = new BufferedWriter(fwt);
		 
		bwt.write(content);
		 
		System.out.println("writing completed ...");
		 
		bwt.close();
		 
		} catch (IOException e) {
		 
		e.printStackTrace();
		 
		}
		}
		}


