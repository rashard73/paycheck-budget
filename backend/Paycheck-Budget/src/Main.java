import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

            System.out.println("How much is your current paycheck: ");
            Scanner input = new Scanner(System.in);
            double paycheck = input.nextDouble();

            System.out.println("Please enter the number of bills you have due in this pay period: ");
            int numOfBills = input.nextInt();

            System.out.println("Enter each bill amount you would like to add: ");

            List<Double> billAmount = new ArrayList<>();

            for (int i = 0; i < numOfBills; i++) {
                billAmount.add(input.nextDouble());
            }

            double remainingFunds = calculateRemainingMoney(billAmount, numOfBills, paycheck);

            System.out.printf("Spending money: $%.2f", remainingFunds);



}
        public static double  calculateRemainingMoney(List<Double> billAmount, int numOfBills, double paycheck) {
            double remaining = paycheck;

            for (int i = 0; i < numOfBills; i++) {
                remaining -= billAmount.get(i);
            }

            return remaining;
        }