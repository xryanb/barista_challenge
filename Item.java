public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item (){}
    
    public Item(String name, double price){
        this.name=name;
        this.price=price;
    }
    
    // GETTERS & SETTERS  - for name and price
    //getter
    public String getName(){
        return this.name;
    }

    //setter
    public void setName(String someName){
        this.name =someName;
    }
     //getter
     public double getPrice(){
        return this.price;
    }

    //setter
    public void setPrice(double somePrice){
        this.price=somePrice;
    }
}
