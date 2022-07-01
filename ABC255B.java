import java.util.Scanner;

public class ABC255B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int light = sc.nextInt();
        int[] lightPeople = new int[light];
        for (int i = 0; i < light; i++) {
            lightPeople[i] = sc.nextInt();
        }
        int peopleWhereX[] = new int[people];
        int peopleWhereY[] = new int[people];
        for (int i = 0; i < people*2; i++) {
            if (i%2 == 0) {
                peopleWhereX[i/2] = sc.nextInt();
            }else{
                peopleWhereY[i/2] = sc.nextInt();
            }
        }
        double maxDistance = 0;
        for (int i = 0; i < light; i++) {//iは光持ってる人の識別
            for (int j = 0; j < people; j++) {
                double distance = Math.pow(peopleWhereX[lightPeople[i]-1] - peopleWhereX[j],2) + Math.pow(peopleWhereY[lightPeople[i]-1] - peopleWhereY[j],2);
                if (maxDistance < distance) {
                    maxDistance = distance;
                }
            }
        }
        System.out.println(Math.sqrt(maxDistance));
        sc.close();
    }
}
