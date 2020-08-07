package trenirovkadoma.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        Runnable run2 = () ->System.out.println("running run2 afteer 5 second");
        run1();
        ses.schedule(run2,5,TimeUnit.SECONDS);//// запустить эту задачу через 5 секунд
        run3();
        ses.shutdown();// ждет завершения запущенных заданий
        ses.awaitTermination(1, TimeUnit.DAYS);// сколько МЫ готовы ждать пока наши потоки выполнятся
        System.out.println("All task submited");
        }
    public static void run1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("running run1");
    }
    public static void run3() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("running run3");
    }
}