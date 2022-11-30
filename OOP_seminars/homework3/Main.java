package homework3;

public class Main {
    public static void main(String[] args) {
        LinkedUser<User> list=new LinkedUser<>();
        list.add(new User("Black","Jack",22));
        list.add(new User("Bill","Koh",50));
        // list.add(new User("Olivia","Tor",21));
        list.add(new User("Prпррr","Pal",23));
        for (User item : list) {
            System.out.println(item);

    }
    
}
}
