package edu.ucsd.dsa.toolbox.module1;

import edu.ucsd.dsa.toolbox.utils.FastScanner;

public class P002_1_MaxPairwiseProductNaive {


    private static long[] readArray() {
        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = fs.nextInt();
        }
        return nums;
    }

    private static long getMaxPairwiseProduct(long[] nums) {
        if (nums.length < 2) throw new IllegalArgumentException("Need at least 2 numbers");
        long max_product = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                max_product = Math.max(max_product, nums[i] * nums[j]);
            }
        }
        return max_product;
    }

    public static void main(String[] args) {
        long[] nums = readArray();
        System.out.println(getMaxPairwiseProduct(nums));
    }
}
