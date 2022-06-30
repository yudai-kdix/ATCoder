import java.util.Scanner;

public class ABC255A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[] b = new int[2];
        b[0] = sc.nextInt();
        b[1] = sc.nextInt();
        a[0][0] = sc.nextInt();
        a[0][1] = sc.nextInt();
        a[1][0] = sc.nextInt();
        a[1][1] = sc.nextInt();
        System.out.println(a[b[0]-1][b[1]-1]);
        sc.close();
    }
}