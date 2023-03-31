//https://leetcode.com/problems/richest-customer-wealth/
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
         int maxWealth = 0;
        int maxWealthTemp = 0;

        for (int i = 0; i< accounts.length; i++){
         
            for (int j=0; j < accounts[i].length; j++){

                maxWealthTemp += accounts[i][j] ;
            }
            if (maxWealth < maxWealthTemp) {
                maxWealth = maxWealthTemp;
            }
            maxWealthTemp = 0;
        }
        return maxWealth;

    }
}
