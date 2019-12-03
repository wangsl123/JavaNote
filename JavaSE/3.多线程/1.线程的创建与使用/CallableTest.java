import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName:CallableTest
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-20 19:51
 * @Version:V1.0
 */
public class CallableTest {
    public static void main(String[] args) {
        NumThread nt = new NumThread();
        FutureTask futureTask = new FutureTask(nt);
        new Thread(futureTask).start();
        try {
            //get()方法的返回值即为FutureTask构造器参数Callable实现类重写call()的返回值
            Object o = futureTask.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class NumThread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
