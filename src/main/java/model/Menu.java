package model;

import view.BookView;
import view.UserView;

import java.util.*;

/**
 * Created by Ольга on 08.11.2016.
 */
public class Menu {
    private List menu = new ArrayList();
    private boolean isExit = false;
    private static HashMap<String, User> users = new HashMap<>();
    private static HashMap<String, Book> books = new HashMap<>();

    public Menu() {
        Data1 d1 = null;
        Data2 d2 = null;
        Data3 d3 = null;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What data source would you like to use? (1,2,3)");
            String a = sc.nextLine();
            if (a.equals("1")){
                d1 = new Data1();
                books = d1.getBooks();
                break;
            } else if (a.equals("2")) {
                d2 = new Data2();
                books = d2.getBooks();
                break;
            } else if (a.equals("3")) {
                d3 = new Data3();
                books = d3.getBooks();
                break;
            } else {
                System.out.println("Wrong input! Type 1, 2 or 3.");
            }

        }
        InitializeUsers.initialize(users, books);
        menu.add(new MenuEntry("List Books - press 1") {
            @Override
            public void run() {
                BookView userView = new BookView(books);
                userView.print();
            }
        });
        menu.add(new MenuEntry("List users - press 2") {
            @Override
            public void run() {

                UserView userView = new UserView(users);
                Scanner sc = new Scanner(System.in);
                System.out.println("Show detailed list? (Y/N)");
                if (sc.nextLine().equals("Y"))
                    userView.printAll();
                else
                userView.print();
            }
        });
        menu.add(new MenuEntry("Give a book - press 3") {
            @Override
            public void run() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Type user's name");
                String user = sc.nextLine();
                if (!users.containsKey(user)) {
                    System.out.println("This user doesn't exist.\nAdd user " + user + "? (Y/N) ");
                    if (sc.nextLine().equals("Y")) {
                        users.put(user, new User(user));
                        System.out.println("new user " + user + " added");
                    }
                    else return;
                }
                System.out.println("Type book's name, format \"%name\"");
                String book = sc.nextLine();
                if (!books.containsKey(book)) {
                    System.out.println("This book doesn't exist.\nAdd book " + book + "? (Y/N) ");
                    if (sc.next().equals("Y")) {
                        books.put(book, new Book(book));
                        System.out.println("new book " + book + " added");
                    }
                    else return;
                }
                if (books.get(book).isTaken())
                    System.out.println("The book is already taken!");
                else
                    try {
                        users.get(user).addBook(books.get(book));
                    }catch (MoreThanThreeBooksExeption e){
                        e.printStackTrace();
                    }

            }
        });
        menu.add(new MenuEntry("Take back a book - press 4") {
            @Override
            public void run() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Type user's name");
                String user = sc.nextLine();
                if (!users.containsKey(user)) {
                    System.out.println("This user doesn't exist.");
                    return;
                }
                System.out.println("Type book's name, format \"%name\"");
                String book = sc.nextLine();
                if (!books.containsKey(book)) {
                    System.out.println("This book doesn't exist.");
                    return;
                }
                users.get(user).removeBook(books.get(book));
            }
        });
        menu.add(new MenuEntry("List out-of-date users - press 5") {
            @Override
            public void run() {
                boolean details = false;
                Scanner sc = new Scanner(System.in);
                System.out.println("Show detailed list? (Y/N)");
                if (sc.nextLine().equals("Y"))
                    details = true;
                for (String u : users.keySet()) {
                    if (users.get(u).isOutOfDate()) {

                        System.out.println(users.get(u));
                        if (details) {
                            System.out.println("Books:");
                            BookView bookView = new BookView(users.get(u).getBooks());
                            bookView.print();
                        }
                    }
                }
            }
        });
        menu.add(new MenuEntry("Exit - press 6") {
            @Override
            public void run() {
                isExit = true;
            }
        });
    }

    public List<MenuEntry> getMenu() {
        return menu;
    }

    public boolean isExit() {
        return this.isExit;
    }
}