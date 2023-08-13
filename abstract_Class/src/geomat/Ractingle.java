

package geomat;

import java.util.Date;


public class Ractingle extends Geomatric{
    private double hight;
    private double wieght;

    public Ractingle() {
    }

    public Ractingle(double hight, double wieght) {
        this.hight = hight;
        this.wieght = wieght;
    }

    public Ractingle(double hight, double wieght, String color, boolean filled, Date date) {
        super(color, filled, date);
        this.hight = hight;
        this.wieght = wieght;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWieght() {
        return wieght;
    }

    public void setWieght(double wieght) {
        this.wieght = wieght;
    }


    
    

    @Override
    public double getArea() {
        double area=hight * wieght;
        return  area;
    }

    @Override
    public double getperemeter() {
       double peremeter= 2 *(hight + wieght);
       return  peremeter;
    }
    
    
}
