public class TestThread extends Thread {
//    Thread giúp cho việc chạy song song các phương thức cùng lúc
    public  void  run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(this.getName() + " " + i);

//          Sleep cứ sau .... milis là chạy 1 lần
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

//        t1.setName("Thread 1 Change");

        t1.start();
//      Join t1 chạy xong thì mới đến t2 và t3
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t3.start();
    }
}
