package model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Created by Ольга on 10.11.2016.
 */
public class Initialize {
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

        Book book1 = new Book("\"Герой нашего времени\"");
        book1.setId(1);
        books.put("\"Герой нашего времени\"",book1);
        Book book2 = new Book("\"Вы конечно шутите, мистер Фейнман\"");
        book2.setId(2);
        books.put("\"Вы конечно шутите, мистер Фейнман\"",book2);
        Book book3 = new Book("\"1984\"");
        book3.setId(3);
        books.put("\"1984\"",book3);
        Book book4 = new Book("\"Ворон\"");
        book4.setId(4);
        books.put("\"Ворон\"",book4);
        Book book5 = new Book("\"Мифы Древней Греции\"");
        book5.setId(5);
        books.put("\"Мифы Древней Греции\"",book5);
        Book book6 = new Book("\"Гарри Поттер и философский камень\"");
        book6.setId(6);
        books.put("\"Гарри Поттер и философский камень\"",book6);
        Book book7 = new Book("\"Портрет Дориана Грея\"");
        book7.setId(7);
        books.put("\"Портрет Дориана Грея\"",book7);
        Book book8 = new Book("\"Туманность Андромеды\"");
        book8.setId(8);
        books.put("\"Туманность Андромеды\"",book8);
        Book book9 = new Book("\"Час Быка\"");
        book9.setId(9);
        books.put("\"Час Быка\"",book9);
        Book book10 = new Book("\"Таис Афинская\"");
        book10.setId(10);
        books.put("\"Таис Афинская\"",book10);
        GregorianCalendar date = new GregorianCalendar();
        date.add(Calendar.MONTH,-2);
        user1.addBook(book1,date);
        user1.addBook(book2,date);
        date.add(Calendar.MONTH,1);
        user2.addBook(book3,date);
        date.add(Calendar.MONTH,-3);
        user3.addBook(book4,date);
    }
}
