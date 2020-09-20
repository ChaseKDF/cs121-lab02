import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        int value1, value2, value3;

        Scanner kbd = new Scanner(System.in);

        System.out.print ("Enter the first number: ");
        value1 = kbd.nextInt();

        System.out.print ("Enter the second number: ");
        value2 = kbd.nextInt();

        System.out.print ("Enter the third number: ");
        value3 = kbd.nextInt();

        double average = (value1 + value2 + value3) / 3.0;
        System.out.print ("The average is: " + average);


    }
}
