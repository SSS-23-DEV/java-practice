package day7;

import java.util.Random;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

     Player(int stamina) {
         this.stamina = stamina;

         if(countPlayers < 6){
             countPlayers++;
         }
    }

    public void run(){
         if(stamina == 0) return;

         this.stamina--;

         if(stamina == 0) countPlayers--;
    }

    public int getStamina(){
        return this.stamina;
    }

    public static void info(){
        switch (countPlayers){
            case 2,3,4,5 -> System.out.printf(
                    "Команды неполные. На поле еще есть %d свободных мест\n",
                    countPlayers
            );
            case 1 -> System.out.printf(
                    "Команды неполные. На поле еще есть %d свободное место\n",
                    countPlayers
            );
            default -> System.out.println("На поле нет свободных мест");
        }
    }
}
