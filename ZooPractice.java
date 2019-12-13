import java.text.NumberFormat;

/**
 *
 * @author Christian Hernandez
 */
public class ZooPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoo sdZoo = new Zoo ();
        Zoo nyZoo = new Zoo ("NY Zoo", "New York", 
                150, 8000, 90000, 15.5, 80000);
        Zoo laZoo = new Zoo ("LA Zoo", "Los Angeles", 
                100, 9000, 1000000, 10.5, 70000);
        
        // I have 3 zoo's but the instructions tell me to only print a single 
        // zoo
        sdZoo.setName("San Diego Zoo");
        sdZoo.setLocation("San Diego");
        
        System.out.println(laZoo.print());
        System.out.println(
                NumberFormat.getCurrencyInstance().format(laZoo.getAnnualProfit()));
        System.out.println();
        System.out.println(nyZoo.print());
        System.out.println(
                NumberFormat.getCurrencyInstance().format(nyZoo.getAnnualProfit()));
        
        
    }
    
    

}
