
package collections;


public class Employees {
    
    int id;
    String name;
    String address;
    String phone;

    public Employees() {
    }

    public Employees(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\n"+"Employees{" + "id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + '}';
    }
    
    
    
    
}
