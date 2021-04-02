package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        
        int[] A = new int[10000000];
        int[] B = new int[10000000];

        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        for (int i = 0; i < k; i++) {
            B[i] = in.nextInt();
        }

        ArrayList<String> lstStr = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while(j < k){
                int t1 = A[i] - x;
                int t2 = A[i] + y;
                if(B[j] >= t1 && B[j] <= t2){
                    String str = String.format("%s %s", i+1, j+1);
                    lstStr.add(str);
                    j++;
                    break;
                } else if(B[j] < t1){
                    j++;
                } else {
                    break;
                }
            }
        }

        System.out.println(lstStr.size());
        for (int i = 0; i < lstStr.size(); i++) {
            System.out.println(lstStr.get(i));
        }
    }
}
