import java.lang.*;
class MyThread1 extends Thread{
    public void run()
    {
        int i=0;
        while(i<4){
            System.out.println("HI");
        i++;
        try{
            Thread.sleep(100);
        }catch (InterruptedException e)
        {
            throw new RuntimeException();
        }
    }}
}
class MyThread2 extends Thread{
    public void run()
    {
        int i=0;
        while(i<4)
        {
            System.out.println("HELLO");
            i++;
            try{
                Thread.sleep(100);
            }catch (InterruptedException e)
            {
                throw new RuntimeException();
            }
        }
    }
}
public class multithreading_1 {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
    }
}
