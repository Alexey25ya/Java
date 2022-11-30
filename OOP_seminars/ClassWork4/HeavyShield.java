package ClassWork4;

public class HeavyShield implements Shield {

    @Override
    public Integer protection() {
        return 20;
    }

    @Override
    public String toString() {
        return "HeavyShield - "+protection();
    }
    
}
