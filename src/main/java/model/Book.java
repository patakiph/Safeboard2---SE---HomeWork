package model;

import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Ольга on 10.11.2016.
 */
public class Book {
    private int id;
    private String name = "no_name";
    private GregorianCalendar returnDate;
    private GregorianCalendar takenDate;
    private boolean isTaken = false;
    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }
    public Book(Book book) {
        this.name = new String(book.getName());
        this.id = book.getId();
        this.setTakenDate(book.getTakenDate());
    }

    public int getId(){return id;};
    public Book setId(int id){this.id = id; return this;}

    public GregorianCalendar getReturnDate(){return this.returnDate;}
    public GregorianCalendar getTakenDate(){return this.takenDate;}
    public void setTaken(boolean t){
        isTaken = t;
    }
    public boolean isTaken(){
        return isTaken;
    }
    public Book setTakenDate(){
        takenDate = new GregorianCalendar();
        returnDate = (GregorianCalendar)takenDate.clone();
        returnDate.add(Calendar.MONTH,1);
        return this;
    }
    public Book setTakenDate(GregorianCalendar date){
        if (date == null)
            setTakenDate();
        else {
            takenDate = (GregorianCalendar) date.clone();
            returnDate = (GregorianCalendar) takenDate.clone();
            returnDate.add(Calendar.MONTH, 1);
        }
        return this;
    }
    public Book setNullDate(){

            takenDate = null;
            returnDate = null;
        return this;
    }
    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object u) {
        if (u == null) return false;
        if (u == this) return true;
        if (!(u instanceof User)) return false;
        User user = (User) u;
        return this.name.equals(user.getName());
    }

    @Override
    public String toString() {
        String str = "id = " + id +
                "; name = " + name;
        return str;
    }

}
