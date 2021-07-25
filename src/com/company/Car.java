import java.util.*;

public class Car {

    public static void main(String[] args) {
	// write your code here
        //HashMap

        HashMap< String,String>carInventory = new HashMap<String,String>();

        carInventory.put("Camry", "Toyota");
        carInventory.put("Civic", "Honda");
        carInventory.put("Benz", "Mercedes");
        carInventory.put("F150", "Ford");

        Scanner car=new Scanner(System.in);


        System.out.println(carInventory+"What car are you interested in purchasing?");
        String carType=car.nextLine();

        if(carInventory.containsKey(car)){
            System.out.println("Awesome, you are interested in a"+carInventory+"We have that for you!");

        } else System.out.println("So sorry, we do not have that vehicle in our inventory!");



    }
}
