import java.util.HashMap;
import java.util.Map;

public class Java_study02 {
    public static class Warehouse {
        private Map<String, Integer> items;
        private int capacity;

        public Warehouse(int capacity) {
            this.items = new HashMap<>(); // 아이템 맵을 초기화
            this.capacity = capacity;
        }

        public Map<String, Integer> get_items() {
            return items;
        }

        public int get_capacity() {
            return capacity;
        }

        public int set_capacity(int new_capacity) {
            if (new_capacity <= 0) {
                System.out.println("잘못된 수량 입니다");
            } else {
                capacity = new_capacity;
            }
            return capacity;
        }

        public void add_item(String item, int quantity) {
            if (quantity <= 0) {
                System.out.println("양수여야 함");
                return;
            }

            int currentTotal = getTotalQuantity();

            if (currentTotal + quantity > capacity) {
                System.out.println("창고 다 참");
            } else {
                items.put(item, quantity);
                System.out.println(item + "가 " + quantity + "만큼 추가됨");
            }
        }

        private int getTotalQuantity() {
            int total = 0;
            for (int quantity : items.values()) {
                total += quantity;
            }
            return total;
        }

        public void remove_item(String item, int quantity) {
            if (items.containsKey(item)) {
                int currentQuantity = items.get(item);
                if (quantity > currentQuantity) {
                    System.out.println("상품이 부족합니다.");
                } else {
                    currentQuantity -= quantity;
                    if (currentQuantity == 0) {
                        items.remove(item);
                    } else {
                        items.put(item, currentQuantity);
                    }
                    System.out.println(item + "가 " + quantity + "만큼 제거됨");
                }
            } else {
                System.out.println("해당 아이템이 존재하지 않습니다.");
            }
        }

        public void display_items() {
            System.out.println("현재 창고 상태: " + items);
        }
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(100);
        warehouse.add_item("사과", 30);
        warehouse.add_item("바나나", 20);
        warehouse.add_item("오렌지", 60);
        warehouse.display_items();
        warehouse.remove_item("사과", 10);
        warehouse.remove_item("바나나", 25); // 부족한 상품을 제거하려고 하면 "상품이 부족합니다"가 출력됨
        warehouse.display_items();
        warehouse.set_capacity(150);
        warehouse.add_item("오렌지", 50);
        warehouse.display_items();
    }
}
