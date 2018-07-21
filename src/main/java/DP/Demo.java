package DP;


import java.util.Scanner;

public class Demo {
    enum AppState {
        START,
        LOGGED_IN,
        STOP
    }
    public static AppState handleStart(Scanner scanner) {
        int logOrExit;
        do {
            System.out.println("1 -> logowanie\n2 -> wyjscie");
            logOrExit = scanner.nextInt();
            scanner.nextLine();

            switch (logOrExit) {
                case 1: {
                    return logToAccount(scanner);
                }
                case 2: {
                    return AppState.STOP;
                }
                default:
                    System.out.println("zla odpowiedz");
            }
        }while (true);
    }

    public static AppState logToAccount(Scanner scaner){
        int count = 0;
        do {
            System.out.println("podaj urztkownika");
            String user = scaner.nextLine();

            System.out.println("podaj haslo");
            String password = scaner.nextLine();

            if(Access.getAccess(user,password)) {
                return AppState.LOGGED_IN;
            }

            System.out.println("niepoprawny urzytkownik lub haslo");
            count++;

        }while (count < 3);
        System.out.println("nie udane 3 pruby wychodziny");
        return AppState.STOP;
    }

    public static AppState handleLoggedIn(Scanner scaner) {

       return printfBorrowExit(scaner);
    }

    private static void borrowBook(Scanner scanner) {
        System.out.println("podaj autora");
        String author = scanner.nextLine();

        System.out.println("podaj tytul");
        String title = scanner.nextLine();

        BooksList.borrowBook(author, title);
    }

    public static AppState printfBorrowExit(Scanner scanner) {
        int option;
        do {
            System.out.println("1 -> wyswietl liste ksiazek\n2 -> wyporzycz\n3-> dodaj urzytkownika\n4-> wyjscie");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    System.out.println(BooksList.printfBookList());
                    break;
                    }
                case 2: {
                    borrowBook(scanner);
                    break;
                 }
                case 3: {
                    break;
                }
                case 4: {
                    return AppState.STOP;
                    }
                    default:
                        System.out.println("zly parametr");
            }
        }while (true);


    }

    public static void main(String[] args) {
        AppState appState = AppState.START;
        Scanner sc = new Scanner(System.in);
        while (true) {
            switch (appState) {
                case START: {
                    appState = handleStart(sc);
                    break;
                }
                case LOGGED_IN: {
                    appState = handleLoggedIn(sc);
                    break;
                }
                case STOP:
                    System.out.println("wyjscie");
                    System.exit(0);
            }
        }
    }
}
