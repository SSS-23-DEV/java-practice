package day7;

public class Day7 {
    static void main(String[] args) {

//        Airplane airplane1 = new Airplane("Air Astana", 2020, 200, 3000);
//        Airplane airplane2 = new Airplane("Scat", 2022, 225, 2500);
//
//        Airplane.compareAirplane(airplane1, airplane2);



        Player player1 = new Player(90);
        Player player2 = new Player(93);
        Player player3 = new Player(91);

        Player.info();

        Player player4 = new Player(93);
        Player player5 = new Player(96);
        Player player6 = new Player(99);

        Player.info();

        Player player7 = new Player(91);

        Player.info();

        for(int i=0; i < 90; i+=1){
            player1.run();
        }

        Player.info();
    }
}
