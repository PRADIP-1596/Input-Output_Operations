package com.bridgelabz.iooperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class ByteStreamsDemo {
 
public static void main(String[] args) throws IOException {
 
FileInputStream fin =null;
FileOutputStream fout =null;
 
try {
 
fin=new FileInputStream("input.txt");
fout=new FileOutputStream("out.txt");
 
int c;
 
while((c=fin.read() )!= -1)
 
{
 
fout.write(c);
 
}
 
} catch (FileNotFoundException e) {
 
// TODO Auto-generated catch block
 
e.printStackTrace();
 
} catch (IOException e) {
 
// TODO Auto-generated catch block
 
e.printStackTrace();
 
}
 
finally {
 
if(fin!=null) {
 
fin.close();
 
}if(fout!=null) {
 
fout.close();
 
}
}
}
 
}