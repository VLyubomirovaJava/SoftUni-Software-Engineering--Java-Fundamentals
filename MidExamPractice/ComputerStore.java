package MidExamPractice;import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String client = scanner.nextLine();
        double priceWithoutTax = 0;
        double Taxes = 0;
        double finalSum = 0;
        while (!client.equals("special") && !client.equals("regular")) {
            double price = Double.parseDouble(client);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                priceWithoutTax += price;
            }
            client = scanner.nextLine();
            Taxes = priceWithoutTax * 0.2;
            finalSum = (priceWithoutTax + Taxes);
            if (client.equals("special")) {
                finalSum *=0.9 ;
            }
        }
            if (finalSum == 0) {
                System.out.println("Invalid order!");
            } else {
                System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", priceWithoutTax, Taxes, finalSum);
            }
        }
    }





