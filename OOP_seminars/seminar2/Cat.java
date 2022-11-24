package Java.OOP_seminars.seminar2;

public class Cat extends Animal implements SpeakAble, RunAble {

    public Cat(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak() {
        return "mau";
    }

    @Override
    public String run() {
        return "50 km/h";
    }
}
