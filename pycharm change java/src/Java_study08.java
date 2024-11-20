import java.util.ArrayList;

public class Java_study08 {
    public static class ShoppingCart{
        private ArrayList<String> items;
        public ShoppingCart(){
            this.items = new ArrayList<>();
        }
        public void add_item(String item){
            items.add(item);
        }
        public void remove_item(String item){
            if(items.contains(item)){
                items.remove(item);
            }
        }
        public void view_cart(){
            System.out.println("장바구니 :"+items);
        }
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add_item("apple");
        shoppingCart.view_cart();
        shoppingCart.remove_item("apple");
        shoppingCart.view_cart();
    }
}
