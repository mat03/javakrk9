package DP.view;

import DP.models.Book;

import java.util.ArrayList;

public class BookView {
    public static String printfBooks(ArrayList<Book> library) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Book book:library) {
            stringBuilder.append(book.toString());
            stringBuilder.append('\n');
        }

        return stringBuilder.toString();
    }

    public static String printfBookIsBorrowed() {
        return new String("The book has been borrowed");
    }

    public static String printfBookUnknown() {
        return new String("Unknown book");
    }
}
