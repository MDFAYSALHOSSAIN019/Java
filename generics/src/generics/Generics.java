
package generics;


public class Generics {

 
    public static void main(String[] args) {
      
        TestG<String, Integer> obj=new TestG<String,Integer>("Robiul Islam", 26);
        
        obj.getMethod_2();
        
        TestG<String, Integer> obj1=new TestG<String,Integer>("Faysal");
        System.out.println(obj1.getMethod());
        
//        TestG<Integer> obj1=new TestG<Integer>(26);
//        System.out.println(obj1.getMethod());
    }
    
}
