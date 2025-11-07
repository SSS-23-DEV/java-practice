package day5;

public class day5 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("black");
        car.setModel("audi");
        car.setYear(2018);

        System.out.printf("Car model: %s, year: %d, color: %s\n", car.getModel(), car.getYear(), car.getColor());


        Motorbike moto = new Motorbike(2020, "black", "Yamaha");

        System.out.println("Motobike model: " + moto.getModel());
        System.out.println("Motobike year: " + moto.getYear());
        System.out.println("Motobike color: " + moto.getColor());
//        System.out.println("Motobike year: " + moto.year); // error
    }
}
