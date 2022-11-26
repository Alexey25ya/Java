package Java.OOP_seminars.seminar3;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        User bigBoss = new User("Большой", "Начальник", 50);
        User littleBoss = new User("Маленький", "Начальник", 33);
        List<User> users = Arrays.asList(new User[]{new User("Василий", "Иванов", 50), 
        new User("Петр", "Петров", 22),
        new User("Герман", "Сидоров", 45),
        new User("Петр", "Георгиев", 56),
        new User("Петр", "Георгиев", 80)});
        Personal personal = new Personal(users);
        for (User user : personal) {
            System.out.println(user);
        }
        Collections.sort(users);
        System.out.println(users);
        Company company = new Company(bigBoss);
        littleBoss.setSubordinates(users);
        bigBoss.setSubordinates(Arrays.asList(littleBoss));
        
        
        for (User user : company) {
            
            System.out.println(user);
        }
        

    }
}
