package service.reachest_customer_wealth;

import java.util.Arrays;

public class Reachest {

    public int firstWay(int[][] accounts) {
        int wealth = 0 ;
        for (int[] account : accounts) {
            int currentWealth = 0;
            for (int i : account) {
                currentWealth += i;
            }
            wealth = Math.max(currentWealth, wealth);
        }
        return wealth;
    }

    public int secondWay(int[][] accounts) {
        int wealth = 0 ;
        for (int[] account : accounts) {
            wealth = Math.max(Arrays.stream(account).sum(), wealth);
        }
        return wealth;
    }
}
