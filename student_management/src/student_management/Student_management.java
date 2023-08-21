
package student_management;

import education.Student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Student_management {

   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    
        Student [] Stu={
        new Student("faysal",25),
        new Student("robiul",22),
        new Student("rajib",22),
        new Student("limon",22)
        };
 
     
     
        FileOutputStream  file=new FileOutputStream("C:\\Users\\user\\Desktop\\binaryFile.dat");
        ObjectOutputStream objectOutput=new ObjectOutputStream(file);
        objectOutput.writeObject(Stu);
        
        
        FileInputStream newFile=new FileInputStream("C:\\Users\\user\\Desktop\\binaryFile.dat");
        ObjectInputStream nwObject=new ObjectInputStream(newFile);
        
        Student [] newStu=(Student[]) nwObject.readObject();
        System.out.println(Arrays.toString(newStu));
    }

 
    }
    

