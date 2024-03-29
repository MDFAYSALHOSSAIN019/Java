
package geomat;

import java.util.Date;


public abstract class Geomatric {
    
    private String color;
    private boolean filled;
    private Date date;

    public Geomatric() {
    }

    public Geomatric(String color, boolean filled, Date date) {
        this.color = color;
        this.filled = filled;
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public abstract double getArea();
    
    public abstract double getperemeter();
    
    
}
