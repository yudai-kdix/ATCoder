import java.util.*;

public class ABC258B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int[] input2 = new int[input1*input1];
        for (int i = 0; i < input2.length; i++) {
            input2[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < input2.length; i++) {
            if (max < input2[i]) {
                max = input2[i];
            }
        }
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        int tmp1 = 0;
        for (int i = 0; i < input2.length; i++) {
            if (max == input2[i]) {
                tmp.add(i);
            }
        }
        for (int i = 0; i < input1; i++) {
            System.out.print(input2[i]);
        }
    }
}
