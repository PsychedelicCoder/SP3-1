import java.sql.Timestamp;
import java.util.Date;

public class ActiveOrder {
//Annika
    //opret ordre
    //evt sæt dem i en liste
    // - og så de kan rykkes evt

    String pizza;
    //price skal laves til en metode
    int price;
    Timestamp timeForOrder;
    //pickup time skal laves til metode
    Timestamp pickupTime;

    public ActiveOrder (String pizza, int price){
        this.pizza = pizza;
        this.price = price;
        calculateTimeForOrder();

        System.out.println("Pizza:" + pizza + "Total amount:" + price + "Order placed at:" + calculateTimeForOrder());
    }

    //tidsmetode
    //man udregne hvad tid og dato, ordren er lagt
    private Timestamp calculateTimeForOrder(){
        Date date = new Date();
        timeForOrder = new Timestamp(date.getTime());
        return timeForOrder;
    }
    //pick up time metode
    //skal udregnes for pizzaernes præp tid.
    private Timestamp pickupTime(){
        
        pickupTime = new Timestamp(date.getTime());
        return pickupTime;
    }
    
    //Pris metode
    //kan udregne prisen for alle pizzaerne i ordrene
}
