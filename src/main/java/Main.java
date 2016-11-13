import controller.MenuRun;
import model.Book;
import model.Menu;
import model.User;

import java.util.List;

/**
 * Created by Ольга on 08.11.2016.
 */
public class Main {


    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuRun menuRun = new MenuRun(menu);
        menuRun.run();
    }
}
