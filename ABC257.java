import java.util.*;;

public class ABC257 {
    public static void main(String[] args) {
        char result = '1';
        char abc[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < input1; j++) {
                input2 = input2 - 1;
                if (input2 == 0) {
                    result = abc[i];
                    break;
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}
