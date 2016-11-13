package controller;

import model.Menu;
import model.MenuEntry;
import view.MenuView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ольга on 08.11.2016.
 */
public class MenuRun {
    Menu menu;

    public MenuRun(Menu menu){
        this.menu = menu;
    }
    public void run() {
        // Бесконечный цикл, пока не нажали кнопку выход
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!menu.isExit()) {
            MenuView.printMenu(menu);
            try {
                String line = reader.readLine();
                if (line.equals("1") == false && line.equals("2") == false && line.equals("3") == false && line.equals("4") == false
                && line.equals("5") == false && line.equals("6") == false)
                    continue;
                int choice = Integer.parseInt(line);
                // Выбираем нажатый пункт меню и выполняем его код
                MenuEntry entry = menu.getMenu().get(choice - 1);
                entry.run();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
