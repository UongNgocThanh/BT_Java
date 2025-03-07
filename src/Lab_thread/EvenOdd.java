package Lab_thread;

class NumberPrinter {
    private int number = 1;

    public synchronized void printOdd() {
        while (number < 10) {
            if (number % 2 == 0) {
//                try {
                try {
                    wait(); // Chờ nếu là số chẵn
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
}
            System.out.println("Odd: " + number);

            number++;
            notify(); // Đánh thức luồng chẵn
        }
    }

    public synchronized void printEven() {
        while (number < 10) {
            if (number % 2 != 0) {
                try {
                    wait(); // Chờ nếu là số lẻ
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            System.out.println("Even: " + number);}
            number++;
            notify(); // Đánh thức luồng lẻ
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}


