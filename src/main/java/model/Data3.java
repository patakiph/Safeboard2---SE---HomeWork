package model;

import java.util.HashMap;

/**
 * Created by Ольга on 18.11.2016.
 */
public class Data3 implements IDataSource {

    public HashMap<String, Book> getBooks(){
        HashMap<String, Book> books = new HashMap<>();
        Book book1 = new Book("\"Война и мир. Том 2\"");
        book1.setId(1);
        books.put("\"Война и мир. Том 2\"",book1);
        Book book2 = new Book("\"Война и мир. Том 3\"");
        book2.setId(2);
        books.put("\"Война и мир. Том 3\"",book2);
        Book book3 = new Book("\"Война и мир. Том 4\"");
        book3.setId(3);
        books.put("\"Война и мир. Том 4\"",book3);
        Book book4 = new Book("\"Тихий дон. Том 1\"");
        book4.setId(4);
        books.put("\"Тихий дон. Том 1\"",book4);
        Book book5 = new Book("\"Тихий дон. Том 2\"");
        book5.setId(5);
        books.put("\"Тихий дон. Том 2\"",book5);
        Book book6 = new Book("\"Тихий дон. Том 3\"");
        book6.setId(6);
        books.put("\"Тихий дон. Том 3\"",book6);
        Book book7 = new Book("\"Тихий дон. Том 4\"");
        book7.setId(7);
        books.put("\"Тихий дон. Том 4\"",book7);
        Book book8 = new Book("\"Евгений Онегин\"");
        book8.setId(8);
        books.put("\"Евгений Онегин\"",book8);
        Book book9 = new Book("\"Отцы и дети\"");
        book9.setId(9);
        books.put("\"Отцы и дети\"",book9);
        Book book10 = new Book("\"Преступление и наказание\"");
        book10.setId(10);
        books.put("\"Преступление и наказание\"",book10);
        return books;
    }
}
