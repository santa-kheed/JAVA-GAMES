import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Check if you birthday date exists in either of the sets that will be show above ");

        String birthdayDates1 =
                                 "1 3 5 7\n"+
                                 "9 11 13 15\n"+
                                 "17 19 21 23\n"+
                                 "25 27 29 31\n";
        String birthdayDates2 =
                                 "2 3 6 7\n"+
                                 "10 11 14 15\n"+
                                 "18 19 22 23\n"+
                                 "26 27 30 31\n";
        String birthdayDates3 =
                                 "4 5 6 7\n"+
                                 "12 13 14 15\n"+
                                 "20 21 22 23\n"+
                                 "28 29 30 31\n";
        String birthdayDates4 =
                                 "8 9 10 11\n"+
                                 "12 13 14 15\n"+
                                 "24 25 26 27\n"+
                                 "28 29 30 31\n";
        String birthdayDates5 =
                                 "16 17 18 19\n"+
                                 "20 21 22 23\n"+
                                 "24 25 26 27\n"+
                                 "28 29 30 31\n";
        

        int day = 0;


        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a value
        System.out.print("Is your birthday in birthday dates 1?: \n");
        System.out.print(birthdayDates1);
        System.out.print("\n Enter n for [NO] and y for [YES]: ");
        char answer = input.nextLine().charAt(0);

        if(answer == 'y'){
            day +=1;
        }

        System.out.print("Is your birthday in birthday dates 2?: \n");
        System.out.print(birthdayDates2);
        System.out.print("\n Enter n for [NO] and y for [YES]: ");
        answer = input.nextLine().charAt(0);

        if(answer == 'y'){
            day +=2;
        }
        System.out.print("Is your birthday in birthday dates 3?: \n");
        System.out.print(birthdayDates3);
        System.out.print("\n Enter n for [NO] and y for [YES]: ");
        answer = input.nextLine().charAt(0);

        if(answer == 'y'){
            day +=4;
        }
        System.out.print("Is your birthday in birthday dates 4?: \n");
        System.out.print(birthdayDates4);
        System.out.print("\n Enter n for [NO] and y for [YES]: ");
        answer = input.nextLine().charAt(0);

        if(answer == 'y'){
            day +=8;
        }
        System.out.print("Is your birthday in birthday dates 5?: \n");
        System.out.print(birthdayDates5);
        System.out.print("\n Enter n for [NO] and y for [YES]: ");
        answer = input.nextLine().charAt(0);

        if(answer == 'y'){
            day +=16;
        }
        System.out.println("YOur birthday is "+day+" right?");

        System.out.println("choose r for [RIGHT] and w for [WRONG]: ");
        char win = input.nextLine().charAt(0);
        if(win == 'r'){
            System.out.println("The programmer is a wizard ");
        }
        else{
            System.out.println("The programmer is a wizard still you only lied in one of the sets ");
        }

       
    }
}
