package ClassWork4;

public class ZeroShield implements Shield {

    @Override
    public Integer protection() {
        return 0;
    }

    @Override
    public String toString() {
        return "ZeroShield -"+ protection();
    }
    
}
