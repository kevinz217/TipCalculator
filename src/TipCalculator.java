import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalCost = 0;
        int peopleNum;
        double tipPercent;
        int temp;
        double input = 0;

        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        peopleNum = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100) ");
        temp = scan.nextInt();
        tipPercent = temp / 100.0;

        while (input != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g 12.50 (-1 to end) ");
            input = scan.nextDouble();
            if (input != -1 ) {
                totalCost = totalCost + input;
            }
        }
        //Make the ones below updated variables instead of long print statements
        System.out.println("-----------------------");
        System.out.println("Bill before tip $" + totalCost);
        System.out.println("Tip Percentage: " + (int) (tipPercent * 100) + "%");
        System.out.println("Total tip: $" + (double) Math.round((totalCost * tipPercent) * 100) / 100);
        System.out.println("Total bill with tip: $" + (double) Math.round(totalCost * (1 + tipPercent) * 100) / 100);
        System.out.println("Per person cost before tip: $" +(double) Math.round((totalCost / peopleNum) * 100) / 100);
        System.out.println("Tip per person: $" + (double) Math.round((totalCost * tipPercent / peopleNum) * 100) / 100);
        totalCost = (totalCost * (1 + tipPercent));
        System.out.println("Total cost per person: $" + (double) Math.round((totalCost / peopleNum) * 100) / 100);
        scan.close();
    }
}
