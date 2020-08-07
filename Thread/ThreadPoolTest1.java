package trenirovkadoma.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5 ; i++)

            executorService.submit(new Work(i));

            executorService.shutdown(); // ждет завершения запущенных заданий
            System.out.println("All task submited");

            executorService.awaitTermination(1, TimeUnit.DAYS);// сколько МЫ готовы ждать пока наши потоки выполнятся
        }
    }

class Work implements Runnable{
    private int id;

    public Work(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was comlited");
    }
}