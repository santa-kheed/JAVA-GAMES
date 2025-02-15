import java.util.Scanner;

public class Lottery{
    public static void main(String[] args) throws Exception {
        System.out.println("THIS IS A LOTTERY GAME PLAY WITH CAUTION: ");

        //Generate a lottery
        int lottery = (int)(Math.random()*100);
        

        //prompt the user to guess a number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (2 digits): ");
        int guess = input.nextInt();

        //Get digits from the lottery
        int lotteryDigit1 = lottery/10;
        int lotteryDigit2 = lottery%10;
        //get digits from the guess
        int guessDigit1 = guess/10;
        int guessDigit2 = guess%10;

        System.out.print("The lottery digits are : "+lottery+"\n");

        if(guess == lottery ){
            System.out.println("Exact match you won ksh1000");
        }

        else if(guessDigit1 == lotteryDigit1 && guessDigit1 == lotteryDigit2){
            System.out.println("match all digits: you won ksh500: ");
        }

        else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit1 || guessDigit2 ==lotteryDigit2){
            System.out.println("match 1 digit: you won ksh 200: ");
        }

        else{
            System.out.println("Sorry no match you loose: ");
        }


    }
}
