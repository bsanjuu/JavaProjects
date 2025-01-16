enum  Vehicle{
    CAR(25000),BUS(35000),TRUCK(150000),CYCLE(15000);
    private int price;
    
    private Vehicle(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class EnumClassEg {

    public static void main(String[] args) {
        // Vehicle v1=Vehicle.CAR;
        // System.out.println("Vehicle Price is: "+v1.getPrice());

        for(Vehicle v:Vehicle.values())
        {
            System.out.println(v.name()+" :"+v.getPrice());
        }


    }
    
}
