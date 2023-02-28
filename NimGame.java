import java.util.Scanner;
import java.lang.*;

public class NimGame {
    public static void main(String[] args) {
        int coins = 12;
        Scanner scan = new Scanner(System.in);

        while(coins > 0) {
            System.out.println("Choose your number between 1 and 3");
            int input = scan.nextInt();
            coins = coins - input;
            System.out.println("Next up. There are " + coins + " left");

            if (input > 3) {
                System.out.println("Wait a minute, that's too high!");
                System.out.println("Loser!!");
                break;

            }
            else if (coins == 0) {
                System.out.println("Winner!");
            }


        }




    }
}

