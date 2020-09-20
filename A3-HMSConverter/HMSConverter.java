import java.util.Scanner;

public class HMSConverter {
    public static void main(String[] args) {
        int h, m, s;
        Scanner time = new Scanner(System.in);

        System.out.print ("Enter Number of Hours: ");
        h = time.nextInt();

        System.out.print ("Enter Number of Minutes: ");
        m = time.nextInt();

        System.out.print ("Enter Number of Seconds: ");
        s = time.nextInt();

        int totalsec = (h*3600) + (m*60) + s;

        System.out.print (h + " hours, " + m + " minutes, and " + s + " seconds is equivalent to " + totalsec + " seconds.");
    }
}
