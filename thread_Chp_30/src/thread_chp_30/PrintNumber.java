
package thread_chp_30;


public class PrintNumber implements Runnable{

    String name;

    public PrintNumber() {
    }

    public PrintNumber(String name) {
        this.name = name;
    }  
    
    
    @Override
    public void run() {
        
        for (int i = 1; i < 6; i++) {
            
            System.out.println(i+" = "+name);
        }
        
    }
    
    
    
    
    
    
    
}
