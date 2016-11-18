package model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Created by Ольга on 10.11.2016.
 */
public class InitializeUsers {
    public static void initialize(HashMap<String, User> users, HashMap<String, Book> books){
        User user1 = new User("Михаил Лермонтов");
        user1.setEmail("lermontov@safeboard.ru").setId(1);
        users.put("Михаил Лермонтов",user1);
        User user2 = new User("Ennio Morricone");
        user2.setEmail("morricone@safeboard.ru").setId(2);
        users.put("Ennio Morricone",user2);
        User user3 = new User("Григорий Печорин");
        user3.setEmail("pechorin@safeboard.ru").setId(3);
        users.put("Григорий Печорин",user3);
        User user4 = new User("Donald Trump");
        user4.setEmail("ILovePutin@safeboard.ru").setId(4);
        users.put("Donald Trump",user4);
        User user5 = new User("Ольга Самсонова");
        user5.setEmail("samsonova@safeboard.ru").setId(5);
        users.put("Ольга Самсонова",user5);
        User user6 = new User("Brian Molko");
        user6.setEmail("placebo@safeboard.ru").setId(6);
        users.put("Brian Molko",user6);
        User user7 = new User("Ville Valo");
        user7.setEmail("him@safeboard.ru").setId(7);
        users.put("Ville Valo",user7);
        User user8 = new User("Ричард Фэйнман");
        user8.setEmail("feinman@safeboard.ru").setId(8);
        users.put("Ричард Фэйнман",user8);
        User user9 = new User("Росомаха");
        user9.setEmail("logan@safeboard.ru").setId(9);
        users.put("Росомаха",user9);
        User user10 = new User("Печенька с вареньем");
        user10.setEmail("cookie@safeboard.ru").setId(10);
        users.put("Печенька с вареньем",user10);


        GregorianCalendar date = new GregorianCalendar();
        date.add(Calendar.MONTH,-2);
        user1.addBook((Book) books.values().toArray()[0],date);
        user1.addBook((Book) books.values().toArray()[1],date);
        date.add(Calendar.MONTH,1);
        user2.addBook((Book) books.values().toArray()[2],date);
        date.add(Calendar.MONTH,-3);
        user3.addBook((Book) books.values().toArray()[3],date);
    }
}
