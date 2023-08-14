
package object_stream_for_arrays;

//import java.io.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInput;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutput;
//import java.io.ObjectOutputStream;
//import java.util.logging.Level;
//import java.util.logging.Logger;


public class Object_Stream_For_Arrays {

   
    public static void main(String[] args) {
        
        
//        FileOutputStream fileoutputStream=null;
//        try {
//            int [] number={56, 85, 63, 89};
//            String [] massage={"hello","java"," well-come CCLS", "hooo"};
//            fileoutputStream = new FileOutputStream(new File("C:\\Users\\user\\Desktop\\new.txt"));
//            ObjectOutputStream objectoutputStream=new ObjectOutputStream(fileoutputStream);
//            
//            objectoutputStream.writeObject(number);
//            objectoutputStream.writeObject(massage);
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Object_Stream_For_Arrays.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Object_Stream_For_Arrays.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                fileoutputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Object_Stream_For_Arrays.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        try {
//            FileInputStream fileInputSteam=new FileInputStream("C:\\Users\\user\\Desktop\\new.txt");
//            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputSteam);
//            
//            int[] number=(int[]) objectInputStream.readObject();
//            String[] massage=(String[]) objectInputStream.readObject();
//            
////            System.out.println(Arrays.toString(number));
//            System.out.println(Arrays.toString(massage));
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Object_Stream_For_Arrays.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Object_Stream_For_Arrays.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Object_Stream_For_Arrays.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        



    }
    
}
            
//        FileInputStream fileInputStream=null;
//
//        
//        try {
//            int[] number={23, 56, 23, 58};
//            String [] greating={"hello", "java"};
//            try {
//                FileOutputStream fileOutputStream =new FileOutputStream(new File("C:\\Users\\user\\Desktop\\binaryFile.dat"));
//                
//                try {
//                    ObjectOutput objectOutput=new ObjectOutputStream(fileOutputStream);
//                    
//                    objectOutput.writeObject(number);
//                    objectOutput.writeObject(greating);
//                } catch (IOException ex) {
//                    Logger.getLogger(Object_Stream_For_Arrays.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(Object_Stream_For_Arrays.class.getName()).log(Level.SEVERE, null, ex);
//            }
//                   
//        }