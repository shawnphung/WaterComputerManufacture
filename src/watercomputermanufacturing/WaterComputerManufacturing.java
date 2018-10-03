/*
 * Shawn Phung
 * October 3, 2018
 * To find the number of litres of water needed to make computers
 */

package watercomputermanufacturing;
    import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class WaterComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        // Varaibles and Constants Declaration
        final double waterlitre;
        waterlitre = 1.5;
        int combonumber;
        int comboamount;
        
        //Input and Output
        System.out.println ("Enter the number of computer and monitor combos you have (only whole numbers)");
        combonumber = keyedInput.nextInt();
        comboamount = (int) (combonumber * waterlitre);
        System.out.println ("The amount of water needed to manufacture your combos = " + comboamount + "L");
        
        
    }
    
}
