
package Edducation;

import java.io.Serializable;



public class Student implements Serializable{

public String name;
public int age;
public String address;
public int phone;

    public Student() {
    }

    public Student(String name, int age, String address, int phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\n"+"Student{" + "name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + '}';
    }

 



}