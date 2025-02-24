import java.util.Scanner;

public class DisplayTime{
    public static void main(String[] args) {
        // System.out.println("Enter a number in seconds to get converted to minutes: ");
        // Scanner input = new Scanner(System.in);
        // int seconds = input.nextInt();

        // //get the minutes
        // int minutes = seconds /60;
        
        // //get the remaining seconds
        // int remaining_seconds = seconds%60;

        // System.out.println(minutes +" minutes "+remaining_seconds +" seconds ");
        Scanner input = new Scanner(System.in);
        int farenheit = input.nextInt();

        double celcius = (5.0/5)*(farenheit-32);
        System.out.println(celcius + "Degres");
    }
}