// runnable interface in java

class MyThreadRunnable1 implements Runnable{
    public void run()
    {
        System.out.println("I AM A THREAD  THREAT");
        System.out.println("I AM A THREAD  THREAT");
        System.out.println("I AM A THREAD  THREAT");
        System.out.println("I AM A THREAD  THREAT");
        System.out.println("I AM A THREAD  THREAT");
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<4){
        System.out.println("I AM THREAD 2 NOT A THREAT");
        i++;
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                throw new RuntimeException();
            }
    }
}}
public class multithreading_2
{
    public static void main(String[] args) {
    MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
    Thread gun1 = new Thread(bullet1);

    MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
    Thread gun2 = new Thread(bullet2);
    gun1.start();
    gun2.start();
    }
}

