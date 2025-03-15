import java.util.List;

public class Order {


    List<MenuItem> items;
    private int OrderId;
    private double totalamount;
    private int tablenumber;

    public Order(List<MenuItem> items, int orderId, int tablenumber, double totalamount) {
        this.items = items;
        this.OrderId = orderId;
        this.tablenumber = tablenumber;
        this.totalamount = totalamount;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public int getTablenumber() {
        return tablenumber;
    }

    public void setTablenumber(int tablenumber) {
        this.tablenumber = tablenumber;
    }

    public double getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(double totalamount) {
        this.totalamount = totalamount;
    }
}
