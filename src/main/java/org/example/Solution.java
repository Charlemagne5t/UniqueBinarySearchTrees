package org.example;

public class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        if(n == 0  )  return dp[n];
        dp[1] = 1;
        if(n == 1  )  return dp[n];
        dp[2] = 2;
        if(n == 2  )  return dp[n];

        //dp[3] = dp[0] * dp[3 - 1] + dp[1] * dp[3 - 2] + dp[2] * dp[0];
        //bst[N] = bst[0]*bst[N-1] + bst[1]*bst[N-2] + ... + bst[N-1]*bst[0];
        for (int i = 3; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

}
