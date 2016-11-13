package model;

/**
 * Created by Ольга on 08.11.2016.
 */
public abstract class MenuEntry {
    private String title;

    public MenuEntry(String title){
        this.title=title;
    }

    public abstract void run();

    @Override
    public String toString(){
        return title;
    }
}
