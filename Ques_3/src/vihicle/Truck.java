
package vihicle;


public class Truck extends Vahicle{
    
private int weight; 

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color, double getSalsePrice) {
        super(speed, regularPrice, color, getSalsePrice);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getGetSalsePrice() {
        if(weight>2000){
        double price=getRegularPrice()*.9;
        return price;
        
        }
        else{return getRegularPrice();}
    }
  
    
    


    
}
