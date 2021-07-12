package com.bridgelabz.iooperations;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamDemo {
public static void main(String[] args) {
File file = new File("read.bin");
 
FileOutputStream fos = null;
DataOutputStream dos = null;
try {
 
fos=new FileOutputStream(file);
dos=new DataOutputStream(fos);
dos.writeInt(50244);
dos.writeDouble(400.253);
dos.writeChar('d');
dos.flush();
} catch (IOException e) {
e.printStackTrace();
}finally {
try {
 
if(fos!=null){
fos.close();
}
if(dos!=null){
dos.close();
}
} catch (Exception e) {
 
e.printStackTrace();
}
}
 
/*Reading operation */
FileInputStream fis = null;
DataInputStream dis = null;
 
try {
 
fis = new FileInputStream(file);
dis = new DataInputStream(fis);
System.out.println(dis.readInt());
 
System.out.println(dis.readDouble());
System.out.println(dis.readChar());
} catch (IOException e) {
e.printStackTrace();
}finally {
try {
if(fis!=null){
fis.close();
}
if(dis!=null){
dis.close();
}
} catch (Exception e) {
e.printStackTrace();
}
 
}
}
}
