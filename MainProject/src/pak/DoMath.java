
package pak;


public class DoMath {
      public String  findPrimeNumber(int n){
    int num=n;
    int count=0;
    for(int i=1; i<=num; i++){
    if(n % i ==0){
    count +=1;    
    }
    
    }
    if(count==2){
        return "Prime number";
    }
    else
    {return "Not prime number";} 
    
    
      }
    
}
