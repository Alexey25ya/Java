package Java.OOP_seminars.seminar1;

public class Water extends Product {
    private Integer volume;

    public Water(String name) {
        super(name);
    }

    public Water(String name, double price) {
        super(name, price);
    }

    public Water(String name, double price, Integer volume) {
        super(name, price);
        this.volume = volume;
    }

    public Integer getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return String.format("%s; объем: %d л.", super.toString(), volume);
    }
}
