package edu.ucsd.dsa.toolbox.module1;

import java.util.Random;

/**
 * Stress Testing: generates random test cases, runs 2 different solutions and compares the results
 *
 * Implementation details:
 * 01. the naive solution method
 * 02. the fast solution method
 * 03. a method to generate random input
 * 04. in the main method, write infinite loop to run the 2 solutions on the input and compare the results
 *
 * utility method for printing is added
 */
public class P002_3_MaxPairwiseProductStressTest {

    /**
     * Naive solution O(n^2)
     * @param nums the input array of numbers
     * @return the max product of 2 numbers in the input array
     */
    private static long getMaxPairwiseProductNaive(long[] nums) {
        if(nums == null || nums.length < 2) throw new IllegalArgumentException("Need at least 2 numbers");
        long maxProduct = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                maxProduct = Math.max(maxProduct, nums[i] * nums[j]);
            }
        }
        return maxProduct;
    }

    private static long getMaxPairwiseProductFast(long[] nums) {
        if(nums == null || nums.length < 2) throw new IllegalArgumentException("Need at least 2 numbers");
        int maxIndex1 = -1;
        int maxIndex2 = -1;

        // find the first max
        for (int i = 0; i < nums.length; i++) {
            if (maxIndex1 == -1 || nums[i] > nums[maxIndex1]) {
                maxIndex1 = i;
            }
        }

        // find the second max
        for (int i = 0; i < nums.length; i++) {
            if ((maxIndex2 == -1 || nums[i] > nums[maxIndex2]) && i != maxIndex1) {
                maxIndex2 = i;
            }
        }

        // casting to int is added intentionally to make the test fail with integer overflow,
        // this should produce mismatch between long vs int values when the long value from the naive
        // method is way bigger than the max int value
        // remove "(int)" to make the test passes
        return (int)nums[maxIndex1] *  (int)nums[maxIndex2];
    }

    //generate random test cases
    private static long[] generateRandomArray(int size, long maxValue){
        Random random = new Random();
        long[] nums = new long[size];
        for (int i = 0; i < size; i++) {
            nums[i] = random.nextLong(maxValue + 1);
        }
        return nums;
    }

    // print array helper
    private static void printArray(long[] nums) {
        System.out.println("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("Staring Stress Test...");
        System.out.println("Press Ctrl + c to stop\n");

        int testCount = 0;

        while (true){
            testCount++;

            int size = 2 + (int)(Math.random() * 9); // random number between 2 and 10
            long maxValue = 100_000;
            long[] nums = generateRandomArray(size, maxValue);

            // Run both solutions
            long resultNaive = getMaxPairwiseProductNaive(nums);
            long resultFast = getMaxPairwiseProductFast(nums);

            // Compare results
            if(resultNaive != resultFast){
                System.out.println("MISMATCH FOUND!");
                System.out.println("Test Case: ");
                printArray(nums);
                System.out.println("Result Naive: " + resultNaive);
                System.out.println("Result Fast: " + resultFast);
                System.out.println("\nTest failed after " + testCount + " iterations");
                break;
            }

            // print progress every 1000 tests
            if(testCount % 1000 == 0){
                System.out.println("Passed " + testCount + " tests...");
            }
        }
    }
}
