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
        double[] distance = new double[people];
        double minDistance = 1000000000;//とりあえず初期化
        for (int i = 0; i < people; i++) {//iは全員
            for (int j = 0; j < light; j++) {//jは光持ってる人
                
                //距離の計算
                double tmp = Math.pow(peopleWhereX[i] - peopleWhereX[lightPeople[j]-1],2) + Math.pow(peopleWhereY[i] - peopleWhereY[lightPeople[j]-1],2); 
                if (tmp < minDistance) {//iの人と一番短い光持ってる人との距離を保存
                    minDistance = tmp;
                } 
            }
            distance[i] = minDistance;
        }
        double maxDistance = 0;
        for (int i = 0; i < distance.length; i++) {
            if (maxDistance < distance[i]) {
                maxDistance = distance[i];
            }
        }
        System.out.println(Math.sqrt(maxDistance));
        sc.close();
    }
}