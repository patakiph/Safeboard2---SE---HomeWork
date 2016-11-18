package model;

import java.util.HashMap;

/**
 * Created by Ольга on 18.11.2016.
 */
public interface IDataSource {
    HashMap<String, Book> getBooks();
}
