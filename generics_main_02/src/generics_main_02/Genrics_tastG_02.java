
package generics_main_02;


public class Genrics_tastG_02 <dataType_01, dataType_02>{
    
    dataType_01 name;
    dataType_02 salary;

    public Genrics_tastG_02(dataType_01 name, dataType_02 salary) {
        this.name = name;
        this.salary = salary;
    }
    
   
    public void getMethod(){
    
        System.out.println("float number is : "+name);
        System.out.println("Long number is  : "+salary);
    
    }
    
     public dataType_01 getMethod_01(){
    return name;
    }
     
     public dataType_02 getMethod_02(){
     return salary;
    }
    
}


