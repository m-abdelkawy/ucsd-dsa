package edu.ucsd.dsa.toolbox.module1;

import edu.ucsd.dsa.toolbox.utils.FastScanner;

public class P002_2_MaxPairwiseProductFast {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(getMaxPairwiseProduct(nums));
    }

    private static long getMaxPairwiseProduct(long[] nums) {
        if(nums.length < 2 ) throw new IllegalArgumentException("Need at least 2 numbers");
        int max_index1 = -1;
        int max_index2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max_index1 == -1 || nums[i] > nums[max_index1]) {
                max_index1 = i;
            }
        }
        for  (int i = 0; i < nums.length; i++) {
            if((max_index2 == -1 || nums[i] > nums[max_index2]) && i != max_index1) {
                max_index2 = i;
            }
        }
        return nums[max_index1] *  nums[max_index2];
    }
}
