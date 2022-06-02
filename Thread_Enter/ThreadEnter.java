package Thread_Enter;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadEnter {

    public static void start() {
        Thread thread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine(); // поток останавливается и ждёт Enter

            System.exit(0);
        });
        thread.start();

        while (true) {
            System.out.println("TEST MESSAGE");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        start();
    }
}

