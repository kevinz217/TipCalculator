import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalCost = 0;
        int peopleNum;
        double tipPercent;
        int temp;
        double input = 0;
        String items;

        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        peopleNum = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100) ");
        temp = scan.nextInt();
        scan.nextLine();
        tipPercent = temp / 100.0;

        while (input != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g 12.50 (-1 to end) ");
            input = scan.nextDouble();
            scan.nextLine();
            if (input != -1 ) {
                totalCost = totalCost + input;
            }
            System.out.println("Enter the item: ");
            scan.nextLine();
            items = ;
        }

        System.out.print("Would you like to enter a star rating? (0-5) ");
        int starNum = scan.nextInt();

            // change into variables
        System.out.println("-----------------------");
        System.out.println("Bill before tip $" + totalCost);
        System.out.println("Tip Percentage: " + (int) (tipPercent * 100) + "%");
        System.out.println("Total tip: $" + (double) Math.round((totalCost * tipPercent) * 100) / 100);
        System.out.println("Total bill with tip: $" + (double) Math.round(totalCost * (1 + tipPercent) * 100) / 100);
        System.out.println("Per person cost before tip: $" +(double) Math.round((totalCost / peopleNum) * 100) / 100);
        System.out.println("Tip per person: $" + (double) Math.round((totalCost * tipPercent / peopleNum) * 100) / 100);
        totalCost = (totalCost * (1 + tipPercent));
        System.out.println("Total cost per person: $" + (double) Math.round((totalCost / peopleNum) * 100) / 100);
        System.out.println("Star Rating: " + starNum + " stars");
        if (starNum == 5) {
            System.out.println("Thank you for giving us 5 stars!");
        } else if (1 < starNum && starNum < 5) {
            System.out.println("We'll try to improve the next time you come");
        } else {
            System.out.println("How can you be so cruel??!");
        }
        scan.close();
        // learned Math.round from https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
    }
}
