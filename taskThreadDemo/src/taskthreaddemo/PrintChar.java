
package taskthreaddemo;


public class PrintChar implements Runnable{
    
    private char charTOPrint;
    private int times;
    
    public printChar(char c,int t){
    charTOPrint=c;
    times = t;           
    
    }
    

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
    
}
