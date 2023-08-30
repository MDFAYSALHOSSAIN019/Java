
package factory_mang;

import factory.Employees_03;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;


public class Employees_mang_03 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        
                Employees_03 [] Stu={
        new Employees_03("faysal",25000),
        new Employees_03("robiul",22000),
        new Employees_03("rajib",20000),
        new Employees_03("limon",28000)
        };
 
     
     
        FileOutputStream  file=new FileOutputStream("C:\\Users\\user\\Desktop\\binaryFile.dat");
        ObjectOutputStream objectOutput=new ObjectOutputStream(file);
        objectOutput.writeObject(Stu);
        
        
        FileInputStream newFile=new FileInputStream("C:\\Users\\user\\Desktop\\binaryFile.dat");
        ObjectInputStream nwObject=new ObjectInputStream(newFile);
        
        Employees_03 [] newStu=(Employees_03[]) nwObject.readObject();
        System.out.println(Arrays.toString(newStu));
    }

        
        
        
        
    }  
    
    
    

