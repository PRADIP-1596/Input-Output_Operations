package com.bridgelabz.iooperations;

import java.io.Serializable;

public class ObjectStreamDemo implements Serializable {
	 
int age ;
String name;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
} }