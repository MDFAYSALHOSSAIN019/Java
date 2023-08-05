package method_New;

public class Circle {

//    public double redius;

    private double redius;

    public void setRedius(double r) {
        
        if(r>=1){ this.redius = r;}
        else{ System.out.println("plse enter positive number");}
    }
    
    
    public double area() {

        double area = Math.PI * Math.pow(redius, 2);

        return area;
    }

    public double perimiter() {

        double perimiter = 2 * Math.PI * redius;
        
        return perimiter;    
    }
    

}
