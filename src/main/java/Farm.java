import java.util.Scanner;

public class Farm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        int chickens = scanner.nextInt();
        System.out.println("How many cows do you have?");
        int cows = scanner.nextInt();
        System.out.println("How many pigs do you have?");
        int pigs = scanner.nextInt();
        System.out.println(animals(chickens, cows, pigs));
    }
    public static String animals(int chickens, int cows, int pigs){
        return (chickens * 2) + (cows * 4) + (pigs * 4) + " is the total amount of animal legs.";
    }
}