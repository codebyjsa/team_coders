package linear_search.prob_9_palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        Long num = Long.valueOf(x);
        Long rev = Long.valueOf(0);
        if (x<0){
            return false;
        }
        while (num!=0){
            rev += num%10;
            num /= 10;
            rev *= 10;
        }
        rev /= 10;
        if (rev == x){
            return true;
        }
        return false;
    }
}

class Solution2 {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x!=0 && x%10==0))return false;
        int num = 0;
        while(x>num){
            num = num * 10 + (x%10);
            x = x / 10;
        }
        return (x == num || x==num/10);
    }
}

public class prob_9_palindrome_number {
    public static void main(String[] args) {
        int x = 121;
        Solution2 s = new Solution2();
        System.out.println(s.isPalindrome(x));
    }
}
