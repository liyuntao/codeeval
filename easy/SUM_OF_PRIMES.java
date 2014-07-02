package codeeval.easy;

/**
 * Created by liyuntao on 2014/6/19.
 */
public class SUM_OF_PRIMES {

    private static int getPrimes() {
        int[] nums = new int[5000];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = 2 * i + 1;
        }
        nums[0] = 0;
        for (int i = 1; i < nums.length; i++) { // 消除
            if(nums[i] == 0) {
                continue;
            }
            int p = 3;
            while(nums[i] * p <= 4999*2+1) {
                nums[(nums[i] * p - 1 )/ 2] = 0;
                p += 2;
            }
        }

        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                sum += nums[i];
                System.out.print(nums[i] + " ");
                count++;
                if(count == 999) {
                    return sum + 2;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getPrimes()); //right answer is 3682913
    }
}
