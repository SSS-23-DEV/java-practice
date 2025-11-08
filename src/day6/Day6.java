package day6;

public class Day6 {
    public static void main(String[] args) {
//        Airplane plane = new Airplane("Air Astana", 2019, 200, 1000);
//
//        plane.info();
//
//        plane.setYear(2030);
//        plane.setLength(250);
//
//        plane.info();
//
//        System.out.println("Fuel: "+  plane.getFuel());
//        plane.fillUp(20);
//        System.out.println("Fuel: "+  plane.getFuel());
//        plane.fillUp(30);
//        System.out.println("Fuel: "+  plane.getFuel());
//
//        plane.info();


        Teacher teacher = new Teacher("Sagyndyk", "IT");

        System.out.println(teacher.getName());
        System.out.println(teacher.getSubject());

        Student student = new Student("Renat");

        System.out.println(student.getName());

        teacher.evaluate(student.getName());
    }
}
