package ClassWork4;

public abstract class Warrior<T extends Weapon, S extends Shield> {
    private String name;
    private Integer healthPoint;
    private T weapon;
    private S shield;


    public Warrior(String name, Integer healthPoint, T weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield=shield;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public S getShield() {
        return shield;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d", weapon,shield, name, healthPoint);
    }

 
}
