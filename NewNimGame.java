import java.util.Scanner;
public class NewNimGame {
    public static void main(String[] args) {
        int coins = 12;
        System.out.println("Welcome to NIM Plus. Would you like to go first?");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        int numTake = 0;

        while (coins > 0) {
            if(first.equalsIgnoreCase("Y")) {
                System.out.println("There are " + coins + " left");
                System.out.println("Take 1-3:");
                numTake = input.nextInt();



                if (numTake > 3) {
                    System.out.println("That is NOT allowed!");
                    break;

                }
                else if (numTake < 1) {
                    numTake = 1;
                }

                coins -= numTake;

                if (coins <= 0) {
                    System.out.println("You lose!");
                }



            }

        }
    }
}
