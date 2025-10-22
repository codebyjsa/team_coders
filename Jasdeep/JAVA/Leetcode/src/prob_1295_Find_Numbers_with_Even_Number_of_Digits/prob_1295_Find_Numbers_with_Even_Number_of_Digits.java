package prob_1295_Find_Numbers_with_Even_Number_of_Digits;

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    public boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }

    public int digits (int num){
        if(num<0){
            num*=-1;
        }
        if(num == 0){
            return 1;
        }
        int digits = 0;
        while (num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
}

class Solution2 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    public boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits%2==0;
    }

    public int digits (int num){
        if(num<0){
            num*=-1;
        }
        if(num == 0){
            return 1;
        }
        int digits = 0;
        while (num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
}

class Solution3 {

    //Optimized Solution

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    public boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits%2==0;
    }

    public int digits (int num){
        if(num<0){
            num*=-1;
        }
        return (int)Math.log10(num)+1;
    }
}

public class prob_1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        Solution3 s = new Solution3();
        System.out.println(s.findNumbers(nums));
    }
}
