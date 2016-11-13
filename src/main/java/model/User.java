package model;

import java.util.*;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Ольга on 10.11.2016.
 */
public class User {
    private final Logger log = LogManager.getLogger(User.class);
    private int id;
    private String name = "no_name";
    private String email;
    private boolean isOutOfDate = false;
    private HashMap<String, Book> books = new HashMap<>();

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public Book addBook(Book book) {
        Book takenBook = book;
        if (books.size() < 3) {
            book.setTaken(true);
            book.setTakenDate();
            books.put(book.getName(), book);
        } else throw new MoreThanThreeBooksExeption("No more than three books to one user!");
        log.info("Book " + takenBook.getName() + "added to user " + this.getName() + "; return date: " + new Date(takenBook.getReturnDate().getTimeInMillis()));
        return takenBook;
    }

    public Book addBook(Book book, GregorianCalendar date) {
        Book takenBook = book;
        book.setTaken(true);
        book.setTakenDate(date);
        if (books.size() < 3)
            books.put(book.getName(), book);
        else throw new MoreThanThreeBooksExeption("No more than three books to one user!");
        log.info("Book " + takenBook.getName() +" "+ "  added to user " + this.getName() + "; return date: " + new Date(takenBook.getReturnDate().getTimeInMillis()));
        return takenBook;
    }

    public Book removeBook(Book book) {
        if (book == null) return book;
        book.setTaken(false);
        if (books.containsKey(book.getName())) {
            if (isOutOfDate())
                log.info("This user is out of date!");
            books.remove(book.getName());
            log.info("Book " + book.getName() +" "+ "  removed from user " + this.getName() + "; return date: " + new Date(book.getReturnDate().getTimeInMillis()));
            book.setNullDate();
        } else
            System.out.println("This user doesn't have this book!");
        return book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setName(String name) {
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
                "; name = " + name +
                "; email = " + email +
                "; is out of date = " + isOutOfDate;
        return str;
    }

    public HashMap<String, Book> getBooks() {
        return books;
    }

    public boolean isOutOfDate() {
        boolean outOfDate = false; //если человек был с просроченной книгой, но отдал её, то сначала он будет просроченным, поэтому нужен флажок внутри цикла
        GregorianCalendar currentDate = new GregorianCalendar();
        for (Book b : books.values()) {
            if (b.getReturnDate().before(currentDate)) {
                isOutOfDate = true;
                outOfDate = true;
            }
        }
        if (!outOfDate)
            isOutOfDate = false;
        return isOutOfDate;
    }
}
