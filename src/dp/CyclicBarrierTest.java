package dp;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author ming
 * @date 2019/4/15 9:09
 */
public class CyclicBarrierTest {
    public static void main(String[] args){
        CyclicBarrier c = new CyclicBarrier(2);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    c.await();
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("t1");
            }

        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("t2");
            }
        });

        t1.start();
        t2.start();
    }
}
