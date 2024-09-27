import java.util.*;

class ATM {

    float Balance;
    int PIN = 1234;

    public void checkpin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Please enter a valid pin!!");
            checkpin();
        }
    }

    public void menu() {
        System.out.println();
        System.out.println("What do you wish to perform?");
        System.out.println("1. Check A/C balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                checkBalance();

            case 2:
                withdrawMoney();

            case 3:
                depositMoney();

            case 4:
                return;

            default:
                System.out.println("Enter a valid choice!!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance!!");
        } else {
            Balance = Balance - amount;
            System.out.println(amount + " withdrawn successfully!!");
        }
        menu();

    }

    public void depositMoney() {
        System.out.println("Enter amount to be deposited: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println(amount + " deposited successfully!!");
        menu();
    }
}

public class ATMmachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
