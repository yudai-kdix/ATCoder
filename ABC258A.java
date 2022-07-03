import java.util.Scanner;

public class ABC258A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int hours = 21;
        if (minutes >= 60) {
            hours += (int) minutes/60;
        }
        String str = String.format("%d:%02d",hours,minutes%60,0);
        System.out.println(str);
    }
}