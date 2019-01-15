import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Wątek 2 Zadanie 1: " + i);
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Wątek 2 Zadanie 2: " + i);
                }
            }
        });

        for (int i = 0; i < 10000; i++) {
            System.out.println("Wątek 1: " + i);
        }

        executorService.shutdown();
    }
}
