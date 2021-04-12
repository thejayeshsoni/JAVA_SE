class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name + " is checking");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println(" BALANCE.");
    }

    synchronized public void withdrawal(String name, int amount) {
        System.out.print(name + " is withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println(amount + " Rs.");
    }
}

class Customer extends Thread {
    ATM atm;
    String customerName;
    int customerAmount;

    Customer(String n, ATM a, int amt) {
        customerName = n;
        customerAmount = amt;
        atm = a;
    }

    public void useATM() {
        atm.checkBalance(customerName);
        atm.withdrawal(customerName, customerAmount);
    }

    public void run() {
        useATM();
    }
}

public class ATM_MACHINE {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("TIM", atm, 1000);
        Customer c2 = new Customer("LISA", atm, 2000);
        c1.start();
        c2.start();
    }
}
