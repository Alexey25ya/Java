package ClassWork4;

public class Mage extends Warrior<Staff,Shield>{
    private Integer range;
    private Integer mana;

    public Mage(String name, Integer healthPoint, Staff weapon,Shield shield,Integer range,Integer mana) {
        super(name, healthPoint, weapon,shield);
        this.range = range;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return String.format("Mage - %s, mana - %d, range - %d",super.toString(),mana,range);
    }
}
