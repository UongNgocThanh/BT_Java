package Lab_thread;
class CountdownThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Dừng 1 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Countdown finished!");
    }
}

public class CountdownApp {
    public static void main(String[] args) {
        CountdownThread countdown = new CountdownThread();
        countdown.start(); // Bắt đầu luồng đếm ngược
    }
}
