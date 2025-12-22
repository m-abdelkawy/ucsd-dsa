import random


def get_max_pairwise_product_naive(nums):
    if len(nums) < 2:
        raise ValueError("Need at least 2 numbers")
    max_product = float("-inf")
    size = len(nums)
    for i in range(size):
        for j in range(i + 1, size):
            max_product = max(max_product, nums[i] * nums[j])
    return max_product

def get_max_pairwise_product_fast(nums):
    if len(nums) < 2:
        raise ValueError("Need at least 2 numbers")
    max_index1 = -1
    max_index2 = -1

    # find first max
    for i in range(len(nums)):
        if max_index1 == -1 or nums[max_index1] < nums[i]:
            max_index1 = i
    
    # find second max
    for i in range(len(nums)):
        if (max_index2 == -1 or nums[max_index2] < nums[i]) and max_index1 != i:
            max_index2 = i

    return nums[max_index1] * nums[max_index2]

def generate_random_array(size, max_value):
    """Generate random test case"""
    return [random.randint(0, max_value) for _ in range(size)]

def stress_test():
    print("Starting stress test...")
    print("Press ctrl+c to stop\n")

    test_count = 0

    while True:
        test_count += 1

        # Generate random test case
        # small arrays with size between 2 and 10
        size = random.randint(2, 10)
        max_value = 100_000
        nums = generate_random_array(size, max_value)

        # run both solutions on the random input
        result_naive = get_max_pairwise_product_naive(nums)
        restult_fast = get_max_pairwise_product_fast(nums)

        # Compare restults 
        if result_naive != restult_fast:
            print("MISMATCH FOUND")
            print(f"Test case: {nums}")
            print(f"naive result: {result_naive}")
            print(f"fast result: {restult_fast}")
            print(f"\nTest failed after {test_count} iterations")
            break

        # Print Progress every 1000 tests
        if test_count % 1000 == 0:
            print(f"Passed {test_count} tests...")

if __name__ == "__main__":
    try:
        stress_test()
    except KeyboardInterrupt:
        print("\n\nStress test stopped by user")