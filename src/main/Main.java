package src.main;

import java.util.concurrent.TimeUnit;

public class Main {

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
