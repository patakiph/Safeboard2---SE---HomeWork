package model;

import java.util.HashMap;

/**
 * Created by Ольга on 18.11.2016.
 */
public class Data2 implements IDataSource {

    public HashMap<String, Book> getBooks(){
        HashMap<String, Book> books = new HashMap<>();
        Book book1 = new Book("\"Сказка о потерянном времени\"");
        book1.setId(1);
        books.put("\"Сказка о потерянном времени\"",book1);
        Book book2 = new Book("\"Обитаемый остров\"");
        book2.setId(2);
        books.put("\"Обитаемый остров\"",book2);
        Book book3 = new Book("\"Разрисованная вуаль\"");
        book3.setId(3);
        books.put("\"Разрисованная вуаль\"",book3);
        Book book4 = new Book("\"Как выучить C++ за 21 день\"");
        book4.setId(4);
        books.put("\"Как выучить C++ за 21 день\"",book4);
        Book book5 = new Book("\"Крестный отец\"");
        book5.setId(5);
        books.put("\"Крестный отец\"",book5);
        Book book6 = new Book("\"Война и мир. Том 1\"");
        book6.setId(6);
        books.put("\"Война и мир. Том 1\"",book6);
        Book book7 = new Book("\"Колобок\"");
        book7.setId(7);
        books.put("\"Колобок\"",book7);
        Book book8 = new Book("\"Библия\"");
        book8.setId(8);
        books.put("\"Библия\"",book8);
        Book book9 = new Book("\"Скотный двор\"");
        book9.setId(9);
        books.put("\"Скотный двор\"",book9);
        Book book10 = new Book("\"Руслан и Людмила\"");
        book10.setId(10);
        books.put("\"Руслан и Людмила\"",book10);
        return books;
    }
}
