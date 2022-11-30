package ClassWork4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hiro",150,new Staff(),new HeavyShield());
        Hero hero2 = new Hero("Imir",150,new Staff(),new RoundShield());
        Hero hero3=new Hero("Thor",150,new Staff(),new ZeroShield());
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Man",100,new LongBow(),new RoundShield(),20));
        red.add(new Archer("Alex",100,new Bow(),new HeavyShield(),15));
        Team<Warrior> blue = new Team<>(hero2);
        blue.add(new Archer("Man2",100,new Bow(),new ZeroShield(),20));
        blue.add(new Mage("Alex2",100,new Staff(),new HeavyShield(),15,30));
        Team<Warrior> green = new Team<>(hero3);
        green.add(new Mage("Bob", 80, new Staff(), new RoundShield(), 15, 100));
        green.add(new Archer("Bill", 100, new Bow(), new HeavyShield(), 10));
        green.add(new Archer("Jack", 100, new Bow(), new ZeroShield(), 10));
        System.out.println(red);
        System.out.println(" Total HP "+red.getTeamHelspoint());
        System.out.println(blue);
        System.out.println(" Total HP "+blue.getTeamHelspoint());
        System.out.println(green);
        System.out.println(" Total HP "+green.getTeamHelspoint());
        


    }
}