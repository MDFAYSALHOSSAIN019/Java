
package Arrays;


public class Array_Generics<T> {
    
    T[] colar;

    public Array_Generics() {
    }

    public Array_Generics(T[] colar) {
        this.colar = colar;
    }

 
    public T getMethod(T color){
    return color;
    }
    
    
}
