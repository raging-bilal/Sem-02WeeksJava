package Week5;

import java.util.Scanner;

class Commission {
    private double sale;

    public Commission(double sale) {
        this.sale = sale;
    }

    public double calculateCommission() {
        if (sale < 0) {
            return -1; // Indicates invalid input
        } else if (sale < 500) {
            return sale * 0.02; // 2% commission for sales under ₹500
        } else if (sale <= 5000) {
            return sale * 0.05; // 5% commission for sales between ₹500 to ₹5000
        } else {
            return sale * 0.08; // 8% commission for sales ₹5000 and above
        }
    }
}

public class TestCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales amount: ₹");
        double sale = scanner.nextDouble();

        Commission commission = new Commission(sale);
        double commissionAmount = commission.calculateCommission();

        if (commissionAmount == -1) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Commission: ₹" + commissionAmount);
        }

        scanner.close();
    }
}
