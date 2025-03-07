package Lab_thread;
import java.util.LinkedList;
import java.util.Queue;

class DiningTable {
    private final int CAPACITY = 5; // Bàn ăn chứa tối đa 5 món
    private final Queue<String> table = new LinkedList<>();
    private int dishNumber = 1;

    // Đầu bếp nấu ăn
    public synchronized void cook() {
        while (true) {
            try {
                while (table.size() == CAPACITY) {
                    System.out.println("🍽️ Bàn đầy, chờ khách ăn...");
                    wait(); // Chờ đến khi khách hàng ăn
                }
                String dish = "Món ăn " + dishNumber++;
                table.add(dish);
                System.out.println("👨‍🍳 Đầu bếp nấu: " + dish);
                notify(); // Đánh thức khách hàng nếu bàn không trống nữa
                Thread.sleep(2000); // Mất 2 giây để nấu 1 món
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Khách hàng ăn món trên bàn
    public synchronized void eat() {
        while (true) {
            try {
                while (table.isEmpty()) {
                    System.out.println("😕 Bàn trống, chờ đầu bếp nấu...");
                    wait(); // Chờ đến khi có món ăn
                }
                String dish = table.poll();
                System.out.println("🍽️ Khách hàng ăn: " + dish);
                notify(); // Đánh thức đầu bếp nếu bàn chưa đầy
                Thread.sleep(1000); // Mất 3 giây để ăn 1 món
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RestaurantSimulation {
    public static void main(String[] args) {
        DiningTable table = new DiningTable();

        Thread chef = new Thread(table::cook);
        Thread customer = new Thread(table::eat);

        chef.start();
        customer.start();
    }
}

