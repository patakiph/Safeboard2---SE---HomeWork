package view;

import model.Book;
import model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Ольга on 10.11.2016.
 */
public class BookView extends View<String,Book> {
    public BookView(HashMap<String,Book> books) {
        this.entries = books;
    }
}
