import java.util.Scanner;

public class ABC256A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 1;
        for (int i = 0; i < input; i++) {
            result *= 2;
        }
        System.out.println(result);
        sc.close();
    }
}
