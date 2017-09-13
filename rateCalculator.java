import java.util.Scanner;

public class rateCalculator {
    public static void main(String args[])
    {
        System.out.println("This program calculates monthly rate for the purchase comodity.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Price of the comodity in PLN (100 - 10 000): ");
        double a = scanner.nextDouble();

        while (a<100 || a>10000)
        {
            System.out.println("Set the right walue: ");
            System.out.println("Price of the comodity in PLN (100 - 10 000): ");
            a = scanner.nextDouble();
        }
        System.out.println("Price of the comodity: " + a + " PLN");

        System.out.println("Number of installments (6-48): ");
        int b = scanner.nextInt();
        while (b<6 || b>48)
        {
            System.out.println("Set the right number of installments (6-48): ");
            b = scanner.nextInt();
        }
        System.out.println("Number of installments: " + b);
        System.out.println("Price of the comodity: " + a + " PLN");

        double c = 0;
        if (b>=6 || b<=12) //6<=b<=12
        {
            c=0.025;
        }

        else if (b>=13 || b<=24) //13<=b<=24
        {
            c=0.05;
        }

        else if (b>=25 || b<=48) //25<=b<=48
        {
            c=0.1;
        }

        System.out.println("Your installment is: ");
        double z = (a + a*c)/b;
        System.out.format("%.2f%n" , z);
        System.out.print("PLN");
    }
}
