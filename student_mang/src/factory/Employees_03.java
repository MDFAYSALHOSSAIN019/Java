package factory;

import java.io.Serializable;

public class Employees_03 implements Serializable {

    public String name;
    public int salary;

    public Employees_03() {
    }

    public Employees_03(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n"+"Student{" + "name=" + name + ", salary=" + salary + '}';
    }

}
