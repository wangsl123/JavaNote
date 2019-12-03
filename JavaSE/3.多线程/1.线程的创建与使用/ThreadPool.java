import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName:ThreadPool
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-20 20:40
 * @Version:V1.0
 */
public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service = (ThreadPoolExecutor) executorService;
        //设置线程池的属性
        service.setCorePoolSize(12);
        
        executorService.execute(new NumberThread());//runnable
      //  executorService.submit();//callable
        executorService.shutdown();
    }
}

class NumberThread implements  Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
