import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                break;  // Exit loop on invalid input
            }
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();  // Clear buffer (remove line separator)
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers (type any non-integer to stop):");
        inputThenPrintSumAndAverage();
    }
}
