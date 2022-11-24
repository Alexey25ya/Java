package Java.OOP_seminars.seminar2;

public class Turtle extends Animal implements RunAble, SwimAble {

    public Turtle(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String run() {
        return "17 km/h";
    }

    @Override
    public String swim() {
        return "57 km/h";
    }
}
