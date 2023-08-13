package file_class_create_write_read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class File_Class_Create_Write_Read {

    public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\myname.txt");
        Scanner read = new Scanner(file);
        PrintWriter pw = new PrintWriter(file);

//        pw.println("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Maecenas porttitor congue massa. Fusce posuere, magna sed pulvinar ultricies, purus lectus malesuada libero, sit amet commodo magna eros quis urna.\n"
//                + "Nunc viverra imperdiet enim. Fusce est. Vivamus a tellus.\n"
//                + "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Proin pharetra nonummy pede. Mauris et orci."+"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Maecenas porttitor congue massa. Fusce posuere, magna sed pulvinar ultricies, purus lectus malesuada libero, sit amet commodo magna eros quis urna.\n"
//                + "Nunc viverra imperdiet enim. Fusce est. Vivamus a tellus.\n"
//                + "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Proin pharetra nonummy pede. Mauris et orci.");
//        pw.close();
//        System.out.println(pw);
//        int count=file.length()/10;

        if (file.exists()) {
            int count = 0;
            String tenWord = " ";
             int line=1;
          while(read.hasNext()) {
             
             tenWord +=read.next()+" | ";
                count ++;
                 if (count == 10) {
                System.out.println("line no "+line+" --- "+tenWord);
                count = 0;
                tenWord = "";
                line+=1;
            }
            }
           
        } else {
            System.out.println("File is empty");
        }

//String url= "http://emranhss.com";
//        URL objectName= new URL(url);
//        
//        try {
//            Scanner sc=new Scanner(objectName.openStream());
//            
//            while()
//        } catch (IOException ex) {
//            Logger.getLogger(File_Class_Create_Write_Read.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
