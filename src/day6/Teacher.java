package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(String student){
        Random rand = new Random();
        int randomScore = rand.nextInt(2,5);
        String estimation = "";

        switch (randomScore){
            case 2 -> estimation = "неудовлетворительно";
            case 3 -> estimation = "удовлетворительно";
            case 4 -> estimation = "хорошо";
            case 5 -> estimation = "отлично";
        }


        System.out.printf(
                "Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.",
                this.name, student, this.subject, estimation
        );
    }
}