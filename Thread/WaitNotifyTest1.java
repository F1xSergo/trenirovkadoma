package trenirovkadoma.Thread;

import java.util.Scanner;

public class WaitNotifyTest1 {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(wn::produce);
        Thread thread2 = new Thread(wn::consumer);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class WaitAndNotify{
    public void produce(){
        synchronized (this){
            System.out.println("Produce thread started...");
            try {
                wait();//1 - отдаем intrinsic lock, 2 - ждем, пока будет вызван notify().
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producer thread resumed...");
        }
    }
    public void consumer(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();
            System.out.println();
        }
    }
}