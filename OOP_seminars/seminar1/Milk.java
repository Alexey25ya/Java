package Java.OOP_seminars.seminar1;

public class Milk extends Product {
    private Integer fatness;

    public Milk(String name) {
        super(name);
    }

    public Milk(String name, double price) {
        super(name, price);
    }

    public Milk(String name, double price, Integer fatness) {
        super(name, price);
        this.fatness = fatness;
    }

    public Integer getFatness() {
        return this.fatness;
    }

    @Override
    public String toString() {
        return String.format("%s; жирность: %d", super.toString(), fatness);
    }
}
