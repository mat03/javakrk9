package DP;

import java.util.Scanner;

public class KeyboardReader {
    private static Scanner scanner = null;

    Scanner getInstance() {
        if(scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
