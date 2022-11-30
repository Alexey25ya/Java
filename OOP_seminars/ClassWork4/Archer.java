package ClassWork4;

public class Archer extends Warrior<Bow,Shield>{
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public Archer(String name, Integer healthPoint, Bow weapon,Shield shield,Integer range) {
        super(name, healthPoint, weapon,shield);
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Archer - %s, range - %d",super.toString(),range);
    }
}
