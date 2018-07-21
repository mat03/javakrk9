package wyruwnawcze;

public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account();

        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);

        Thread tc1 = new Thread(customer1);
        Thread tc2 = new Thread(customer2);

        tc1.start();
        tc2.start();

        try {
            tc1.join();
            tc2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.getAccount());
    }
}
