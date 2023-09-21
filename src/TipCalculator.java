import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalCost;
        int peopleNum;
        double tipPercent;
        int temp;

        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        peopleNum = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100) ");
        temp = scan.nextInt();
        tipPercent = temp / 100.0;
    }
}
