
package thread_chp_30;


public class Thread_Chp_30 {

    
    public static void main(String[] args) {
        
        PrintNumber pn1=new PrintNumber("Faysal");
        PrintNumber pn2=new PrintNumber("Robiul");
        PrintNumber pn3=new PrintNumber("Limon");
        PrintNumber pn4=new PrintNumber("Rajib");
        PrintNumber pn5=new PrintNumber("johir");
     
        Thread th = new Thread(pn1);
        Thread th2 = new Thread(pn2);
        Thread th3 = new Thread(pn3);
        Thread th4 = new Thread(pn4);
        Thread th5 = new Thread(pn5);
        
        th.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        
    }
    
}
