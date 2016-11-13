package model;

/**
 * Created by Ольга on 10.11.2016.
 */
public class MoreThanThreeBooksExeption extends RuntimeException{

    public MoreThanThreeBooksExeption(String message) {
        super("MoreThanThreeBooksExeption: " + message);
    }
}

