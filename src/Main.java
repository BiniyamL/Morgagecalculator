import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static final int MONTHS_IN_A_YEAR= 12;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter The Principal Amount:");
        double principal= scanner.nextDouble();
        System.out.println("Enter the annual interest rate:");
        float annualInterestRate= scanner.nextFloat();
        System.out.println("Enter the term in year:");
        byte termInYear= scanner.nextByte();
        float monthlyInterestRate= annualInterestRate/MONTHS_IN_A_YEAR;
        int numberOfPayment= termInYear*MONTHS_IN_A_YEAR;
        double monthlyPayment= principal*
                (monthlyInterestRate * (Math.pow(1+ monthlyInterestRate,numberOfPayment ))) /
                ((Math.pow( 1 + monthlyInterestRate,numberOfPayment))-1);
        System.out.println("Monthly payment is:" + NumberFormat.getCurrencyInstance().format(monthlyPayment));
        //System.out.println("total payment:" + NumberFormat.getCurrencyInstance().format((monthlyPayment*numberOfPayment)));
    }
}