package DP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BooksList {
    private static  final List<Book> books = new ArrayList<>();

    private static void addBook(String title, String autor) {
        books.add(new Book(title, autor));
    }

    private static void initBooksList() {
        addBook("Pan Tadeusz", "Adam Mickiewicz");
        addBook("Lalka","Bolesłąw Prus");
        addBook("W pustyni i puszczy", "Henryk Sienkiewicz");
        addBook("a","b");
        addBook("c","d");
    }

    public static String printfBookList() {
        if(books.size() == 0) {
            initBooksList();
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < books.size(); i++) {
            stringBuilder.append(books.get(i).toString());
        }
        return stringBuilder.toString();
    }

    private static boolean itHasBook(String author, String title) {
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return true;
            }
        }

        return false;
    }

    public static void borrowBook(String author, String title) {
        if(books.size() == 0) {
            initBooksList();
        }

        if(!itHasBook(author, title)){
            System.out.println("Brak takiej ksiazki");
            return;
        }

        if(books.remove(new Book(author,title))){
            System.out.println("Ksiazka pozyczona");
        }

    }
}
