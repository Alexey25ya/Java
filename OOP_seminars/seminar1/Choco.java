package Java.OOP_seminars.seminar1;

public class Choco extends Product {
    private Integer kcal;
    private Integer weight;

    public Choco(String name) {
        super(name);
    }

    public Choco(String name, double price) {
        super(name, price);
    }

    public Choco(String name, double price, Integer kcal,Integer weight) {
        super(name, price);
        this.kcal = kcal;
        this.weight=weight;
    }

    public Integer getKcal() {
        return this.kcal;
    }

    public Integer getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return String.format("%s; ккал: %d; вес: %d грамм", super.toString(), kcal, weight);
    }

}
