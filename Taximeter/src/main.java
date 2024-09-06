
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        System.out.println("Weolcome");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Plase Enter How Many Kilometers You Will Travel");
        double kilometer = scanner.nextDouble();
        
        System.out.println("Plase Enter Fee per Kilometers");
        double fee_per_kilometer = scanner.nextDouble();
        
        scanner.nextLine() ; // dummy
        
        System.out.println("Plase Enter Your Currency");
        String currency = scanner.nextLine();
        
        
                
        double cost = kilometer * fee_per_kilometer;
        System.out.println("Your payment is" + cost + currency);
               
    }
}
