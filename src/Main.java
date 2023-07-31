import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean var1 = false;
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to games it.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again: ");
            int guess = scanner.nextInt();
            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess);
            }
            else if (randomNumber > guess) {
                System.out.println("It's greater than " + guess);
            }
            else (randomNumber == guess) {
                var1 = true;
                break;
            }
        }
        if (var1) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Sorry, you lost!");
            System.out.println("The number was: " + randomNumber);
        }
    }
}
