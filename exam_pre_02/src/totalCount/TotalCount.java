
package totalCount;


public class TotalCount {
   
    private double  Quentity;
    private double  unitPrice;
    private double  discount;

    public TotalCount() { 
        //useing insert code apply Constractor default for calling main class..........
    }

    public TotalCount(double Quentity, double unitPrice, double discount) {
        this.Quentity = Quentity;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public double getQuentity() {
        return Quentity;
    }

    public void setQuentity(double Quentity) {
        this.Quentity = Quentity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
    public double totalPrice(){
    
    double totalPrice=Quentity*unitPrice;
    return totalPrice;
    
    }
    
//    public double afterDis(){
//    
//        dis
//        
//    }
    
    
    
    
    
}
