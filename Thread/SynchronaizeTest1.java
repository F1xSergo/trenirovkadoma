package trenirovkadoma.Thread;

public class SynchronaizeTest1 {

    private int counter;

    public static void main(String[] args) {
        SynchronaizeTest1 test = new SynchronaizeTest1();
        test.doWork();
    }
    //ключевое слово synchronized
    public synchronized void increment(){
        counter++;
    }

//    //synchronize блок
//    public void increment(){
//        synchronized (this) {
//            counter++;
//        }
//    }
    public void doWork(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000 ; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public  void run() {
                for (int i = 0; i < 10_000 ; i++)
                    increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
