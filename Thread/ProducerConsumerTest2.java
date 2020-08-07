package trenirovkadoma.Thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest2 {


    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(pc::produce);
        Thread thread2 = new Thread(pc::consumer);

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

class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (queue.size()==LIMIT){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }


    public void consumer()  {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
               int value =  queue.poll();
                System.out.println(value);
                System.out.println("queue size is " + queue.size());
                lock.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

