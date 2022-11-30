package ClassWork4;

public class RoundShield implements Shield {

    @Override
    public Integer protection() {
        return 5;
    }

    @Override
    public String toString() {
        return "RoundShield - "+ protection();
    }
    
}
