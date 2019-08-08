package dp;
import java.util.concurrent.*;

/**
 * @author ming
 * @date 2019/4/15 9:01
 */
public class CountDownLatchTest {
    public static void main(String[] args){
        CountDownLatch  c = new CountDownLatch(2);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
                c.countDown();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2");
                c.countDown();
            }
        });
        t1.start();
        t2.start();

        try {
            c.await();
        }catch (Exception e){

        }

        System.out.println("t3");

    }
}
