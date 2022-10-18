package src.main;

import java.util.concurrent.TimeUnit;

import src.main.model.Bank;
import src.main.model.Transaction;
import src.main.model.account.Account;
import src.main.model.account.Chequing;
import src.main.model.account.Savings;

public class Main {

    static String ACCOUNTS_FILE = "src/main/data/accounts.txt";
    static String TRANSACTIONS_FILE = "src/main/data/tramsactions.txt";

    static Bank bank = new Bank();

    public static void main(String[] args) {

    }

    public static void wait(int milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
