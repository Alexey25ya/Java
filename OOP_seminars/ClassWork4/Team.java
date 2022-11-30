package ClassWork4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T>{
    private Hero hero;
    private List<T> teamList = new ArrayList<>();

    public Team(Hero hero) {
        this.hero = hero;
    }

    public void add(T pers){
        teamList.add(pers);
    }

    @Override
    public Iterator<T> iterator() {
        return teamList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder bild = new StringBuilder("\n" + hero.toString() + "\n");
        for (T item:this) {
            bild.append(item.toString()+ "\n");
        }
        return bild.toString();
    }
    public  Integer getTeamHelspoint() {
        int summ = hero.getHealthPoint();
        for (T member:this) {
            summ += member.getHealthPoint();
        }
        return summ;
    }
}
