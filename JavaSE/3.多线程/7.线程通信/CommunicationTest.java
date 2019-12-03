/**
 * @ClassName:CommunicationTest
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-19 22:03
 * @Version:V1.0
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Number n = new Number();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);

        t1.start();
        t2.start();
    }
}

class Number implements Runnable{
    private int num = 1;
    @Override
    public void run() {
        while(true){
            synchronized(this){
                if(num<=100){
                    notify(); //唤醒被wait线程,如果有多个，则唤醒优先级高的
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;

                    try {
                        //线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
