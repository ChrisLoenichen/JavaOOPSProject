package JavaOOPS1;

public class Car_Tester {
    public static void main(String[] args) {

        Truck truck = new Truck(30000, "black", 2000);
        System.out.println(truck.calculateSalePrice());
        Sedan sedan = new Sedan(30000,"black", 20);
        System.out.println(sedan.calculateSalePrice());
    }

}
