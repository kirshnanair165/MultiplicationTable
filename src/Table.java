import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        int number, multiplier;
        multiplier = 1;
        Scanner intput = new Scanner(System.in);
        System.out.println("Enter the number");
        number = intput.nextInt();
        while (multiplier <= 10) {

            System.out.printf("%d * %d = %d\n", number, multiplier, (number * multiplier));
            multiplier++;
        }

    }
}