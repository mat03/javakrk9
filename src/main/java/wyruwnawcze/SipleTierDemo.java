package wyruwnawcze;

// Każdy program powołuje doży ciagłówny watek tego program

public class SipleTierDemo {
    public static void main(String[] args) {
        Thread simpleTimer = new SimpleTimer("timer1");
        simpleTimer.start();

        try {
            simpleTimer.join(); // chce zeby najpierw watek skonczył swoje zadanie

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //instrukcja glownego watku
        System.out.println("hello word");

    }
}
