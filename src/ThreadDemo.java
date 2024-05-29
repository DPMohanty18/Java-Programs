class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread"+i);
        }
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread obj = new Thread(t1);
        obj.start();
    }
}