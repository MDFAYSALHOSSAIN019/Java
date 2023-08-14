
package readbinary_writetext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadBinary_writeText {

 
    public static void main(String[] args) {
        
        
        try {
            FileInputStream fis= new FileInputStream("C:\\Users\\user\\Desktop\\binaryFile.dat");
            Scanner read=new Scanner(fis);
            PrintWriter pw=new PrintWriter(file);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadBinary_writeText.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
