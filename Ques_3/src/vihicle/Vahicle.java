
package vihicle;


public class Vahicle {
    
    private int speed;
    private double regularPrice;
    private String color;
    private double getSalsePrice;

    public Vahicle() {
    }

    public Vahicle(int speed, double regularPrice, String color, double getSalsePrice) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.getSalsePrice = getSalsePrice;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGetSalsePrice() {
        return getSalsePrice;
    }

    public void setGetSalsePrice(double getSalsePrice) {
        this.getSalsePrice = getSalsePrice;
    }

    public double  getSalaryPrice(){
    
    return regularPrice; 
    }

  
    
}
