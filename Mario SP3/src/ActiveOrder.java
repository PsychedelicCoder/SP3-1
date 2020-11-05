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

    public ActiveOrder (String pizza, int price){
        this.pizza = pizza;
        this.price = price;
        calculateTimeForOrder();

        System.out.println("Pizza:" + pizza + "Total amount:" + price + "Order placed at:" + calculateTimeForOrder());
    }

    //tidsmetode
    //man udregne hvad tid og dato, ordren er lagt
    public Timestamp calculateTimeForOrder(){
        Date date = new Date();
        timeForOrder = new Timestamp(date.getTime());
        return timeForOrder;
    }
    
    //Pris metode
    //kan udregne prisen for alle pizzaerne i ordrene
}
