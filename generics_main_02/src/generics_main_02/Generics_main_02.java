package generics_main_02;

public class Generics_main_02 {

    public static void main(String[] args) {

        Genrics_tastG_02<String, Integer> obj_01 = new Genrics_tastG_02<String, Integer>("Faysal Hossain", 25000);
        System.out.println("Name is    :" + obj_01.getMethod_01() + "\n" + "Salary is :" + obj_01.getMethod_02());

        Genrics_tastG_02<Float, Long> obj_02 = new Genrics_tastG_02<Float, Long>(50.256f, 25478655655874l);

        obj_02.getMethod();
    }

}
