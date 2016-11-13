package view;

import model.Menu;
import model.MenuEntry;

/**
 * Created by Ольга on 08.11.2016.
 */
public class MenuView {
    Menu menu;

    public MenuView(Menu menu) {
        this.menu = menu;
    }

    public static void printMenu(Menu menu) {
        menu.getMenu().forEach(a -> System.out.println(a));
    }
}
