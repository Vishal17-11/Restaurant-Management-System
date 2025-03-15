
import java.util.List;

public class RestaurantManager {

    List<MenuItem> menu;
    List<Order> orders;
    List<Table> tables;

    public RestaurantManager(List<MenuItem> menu, List<Order> orders, List<Table> tables) {
        this.menu = menu;
        this.orders = orders;
        this.tables = tables;
    }

    public void updateMenu(int id, String name, double price){

        for(MenuItem item : menu){
            if(item.getId() == id){

                item.setName(name);
                item.setPrice(price);
                break;
            }else{
                System.out.println("invalid id..");
            }
        }



    }

    public void DeleteItem(int id){



                menu.removeIf(item -> item.getId() == id);



    }
public void addItem(MenuItem item){
        menu.add(item);
}

public void displayMenu(){
        for(MenuItem item : menu){
            System.out.println(item);
        }
}

public void placeOrder(int tablenumber,List<MenuItem> items){
            double totalamount = 0;
            for(MenuItem item : items){

                totalamount += (double) item.getPrice();
            }

            Order order = new Order(items,orders.size() +1,tablenumber,totalamount  );
            orders.add(order);
    System.out.println("Your order is placed total amount :  " + totalamount);


    }
public void GenerateBill(){


}
}
