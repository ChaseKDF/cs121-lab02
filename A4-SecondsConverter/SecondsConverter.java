import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        int totalsec;
        Scanner time = new Scanner(System.in);

        System.out.print ("Enter Total Number of Seconds: ");
        totalsec = time.nextInt();

        int h = totalsec / 3600;
        int m = totalsec % 3600 / 60;
        int s = totalsec % 3600 % 60;

        System.out.println (h + " Hours");
        System.out.println (m + " Minutes");
        System.out.println (s + " Seconds");
    }
}
