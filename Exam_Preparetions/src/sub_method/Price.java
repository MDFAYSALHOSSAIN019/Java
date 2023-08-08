
package sub_method;


public class Price {
    
    private int quentity;
    private double unit_price;

    public Price() {
    }

    public Price(int quentity, double unit_price) {
        this.quentity = quentity;
        this.unit_price = unit_price;
    }

    public int getQuentity() {
        return quentity;
    }

    public void setQuentity(int quentity) {
        this.quentity = quentity;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }
    
    public double calculateTotalPrice(){
    double totalPrice=unit_price*quentity;
    
    return totalPrice;
   
    }
    
    
    
}
