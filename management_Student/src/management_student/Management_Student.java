
package management_student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import managemants.Student;



public class Management_Student {

   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
    
        
        Student students=new Student();
        
        Student[] stud={
        new Student("Robiul islam",25),
        new Student("Faysal Hossain",25),
        new Student("Rajib ",25),
        new Student("Limon",25)
        
        };
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\user\\Desktop\\exam.dat");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(stud);

        
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\user\\Desktop\\exam.dat");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student[] newStudent=(Student[]) objectInputStream.readObject();
        System.out.println(Arrays.toString(newStudent));
    }
    
}
