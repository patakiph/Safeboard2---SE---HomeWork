package view;

import model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Ольга on 10.11.2016.
 */
public class UserView extends View<String,User> {
    public UserView(HashMap<String,User> users) {
        this.entries = users;
    }
    public void printAll(){

        entries.forEach((a,b) -> {
            b.isOutOfDate();
            BookView bookView = new BookView(b.getBooks());
            System.out.println(b);
            System.out.println("Books:");
            bookView.print();
        });
        System.out.println();
        System.out.println();
    }
}
