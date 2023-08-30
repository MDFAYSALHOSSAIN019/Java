
package generics;


public class TestG <DataType, DataType_1>{
    
    DataType name;
    DataType_1 age;

    public TestG(DataType name) {
        this.name = name;
    }

    public TestG(DataType name, DataType_1 age) {
        this.name = name;
        this.age = age;
    }
 
    
    
    public DataType getMethod(){
    
    return name;
    }
    public void getMethod_2(){
    
            System.out.println(name);
            System.out.println(age);
    }
    
}
