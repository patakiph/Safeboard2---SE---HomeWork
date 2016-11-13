package view;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Ольга on 10.11.2016.
 */
public abstract class View<K,T> {
    protected HashMap<K,T> entries;
    public void print(){
        entries.forEach((a,b) -> System.out.println(b));
        System.out.println();
        System.out.println();
    }

}
