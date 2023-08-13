
package geomat;

import java.util.Date;


public class Circle extends Geomatric{
    private double redius;

    public Circle() {
    }

    public Circle(double redius) {
        this.redius = redius;
    }

    public Circle(double redius, String color, boolean filled, Date date) {
        super(color, filled, date);
        this.redius = redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    @Override
    public double getArea() {
       double area=Math.PI*Math.pow(redius, 2);
       return area;
    }

    @Override
    public double getperemeter() {
       double peremeter= 2 * Math.PI * redius;
       return peremeter;
    }

   
    
    
    
}
