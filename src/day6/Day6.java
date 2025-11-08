package day6;

public class Day6 {
    public static void main(String[] args) {
//        Airplane airplane = new Airplane("Air Astana", 2010, 30, 40000);
//
//        airplane.info();
//
//        airplane.setYear(2015);
//        airplane.setLength(35);
//
//        airplane.info();
//
//        System.out.println("Fuel: "+  airplane.getFuel());
//        airplane.fillUp(2000);
//
//        System.out.println("Fuel: "+  airplane.getFuel());
//        airplane.fillUp(3000);
//
//        System.out.println("Fuel: "+  airplane.getFuel());
//
//        airplane.info();

//
//        Car car = new Car();
//        car.setYear(2018);
//        car.info();
//        System.out.println(car.yearDifference(2020));
//
//        Motorbike bike = new Motorbike(2020, "black", "yamaha");
//        bike.info();
//        System.out.println(bike.yearDifference(2025));
//
//
//
        Teacher teacher = new Teacher("Sagyndyk", "IT");

        System.out.println(teacher.getName());
        System.out.println(teacher.getSubject());

        Student student = new Student("Renat");

        System.out.println(student.getName());

        teacher.evaluate(student.getName());
    }
}
