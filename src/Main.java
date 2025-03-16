import java.util.Scanner;

class Main {


    public static void main(String[] args) {


        RestaurantManager SSBiriyani = new RestaurantManager();
        Scanner in = new Scanner(System.in);




        System.out.println("1.Add item \n 2.place order \n 3.GenerateBill \n 4.updateMenu");
        System.out.println("Enter the choice : ");
        int choice = in.nextInt();
        while (true) {
            switch (choice) {

                case 1:
                    System.out.println("enter the itemId to add in menu");
//                Scanner scn = new Scanner(System.in);
                    int itemId = in.nextInt();

                    System.out.println("Enter the name of the item : ");
                    String name = in.next();

                    System.out.println("Enter the price of the item : ");
                    double price = in.nextDouble();


                    MenuItem Item = new MenuItem(itemId, name, price);

                    SSBiriyani.addItem(Item);

                    break;
                case 2:
                    System.out.println();
            }
        }
    }
}