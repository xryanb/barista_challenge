import java.util.ArrayList;


public class TestOrder {
    public static void main(String[] args) {
    
        // Menu items
        Item item1= new Item("mocha", 4);
        Item item2= new Item("latte", 3);
        Item item3= new Item("drip coffee", 2);
        Item item4= new Item("cappucino", 1);

        //guests-no name
        Order order1= new Order();
        Order order2=new Order();

        //overload
        Order order3= new Order("Janet");
        Order order4= new Order("Elvara");
        Order order5= new Order("Ryan");

        //add2items additem method
        order1.addItem(item1);
        order3.addItem(item2);

        //system message
        System.out.println(order1.getStatusMessage());
        System.out.println(order3.getStatusMessage());

        //ready check
        order1.setStatus(true);
        order3.setStatus(true);

        //get order total
        System.out.println(order1.getOrderTotal());
        System.out.println(order3.getOrderTotal());

        //display
        order1.display();
        order3.display();

        // call all orders
        order2.addItem(item4);
        order4.addItem(item3);
        order5.addItem(item2);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
