package model;

import java.util.HashMap;

/**
 * Created by Ольга on 18.11.2016.
 */
public class Data1 implements IDataSource {

    public HashMap<String, Book> getBooks(){
        HashMap<String, Book> books = new HashMap<>();
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
        return books;
    }
}
