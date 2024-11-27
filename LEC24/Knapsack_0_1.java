package LEC24;
import java.util .*;
import java.util.Arrays;
public class Knapsack_0_1 {
        public static void main(String args[]) {
            //5 4
            //1 2 3 2 2
            //8 4 0 5 3
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); //5 no of product
            int cap = sc.nextInt();//4 capacity
            int w[] = new int[n];  //1 2 3 2 2 weight of the product
            int v[] = new int[n]; // //8 4 0 5 3 value of the product
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }
            int dp[][] = new int[cap + 1][w.length];
            for (int a[] : dp) {
                Arrays.fill(a, -1);
            }
            int ans = Knapsack0(cap, w, v, 0, dp);
            System.out.println(ans);
        }

        public static int Knapsack0(int cap, int wt[], int val[], int i, int dp[][]) {
            if (cap == 0 || wt.length == i) {
                return 0;
            }
            if (dp[cap][i] != -1) {
                return dp[cap][i];
            }
            int pick = 0;
            int not_pick = 0;
            if (wt[i] <= cap) {
                pick = val[i] + Knapsack0(cap - wt[i], wt, val, i + 1, dp);
            }
            not_pick = Knapsack0(cap, wt, val, i + 1, dp);
            return dp[cap][i] = Math.max(pick, not_pick);
        }
    }