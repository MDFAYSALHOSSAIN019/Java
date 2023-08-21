package stdent_management;

import Edducation.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Stdent_Management{

public static void main(String[] arge) throws FileNotFoundException, IOException, ClassNotFoundException{

    Student[] students={
    new Student("faysal",26,"Dhaka",1864898071),
    new Student("robiul",27,"nawga",03414564444),
    new Student("Limon",26,"Foridpur",1541234564),
    new Student("Tamim",28,"Josor",265821655)
    };
    
    
    
    File file=new File("C:\\Users\\user\\Desktop\\examFile.dat");
    FileOutputStream fileOutputStream=new FileOutputStream(file);
    ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(students);


    FileInputStream fileInputStream=new FileInputStream("C:\\Users\\user\\Desktop\\examFile.dat");
    ObjectInputStream ObjectInputStream=new ObjectInputStream(fileInputStream);
    
    Student[] newstudent=(Student[]) ObjectInputStream.readObject();
    System.out.println(Arrays.toString(newstudent));
}



}