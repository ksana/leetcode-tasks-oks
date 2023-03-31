// https://leetcode.com/problems/palindrome-number/
// Given an integer x, return true if x is a 
// palindrome , and false otherwise.

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        
        String a = x + "";
        StringBuilder b = new StringBuilder(x + "");
       // System.out.println(a);
        String b1 = b.reverse().toString();
       // System.out.println( a + " " + b);
        if (a.equals(b1)) {
            return true;
        } else {
            return false;
        }
        
    }
}
