def read_array():
    n = int(input())
    nums = list(map(int, input().split()))
    if len(nums) != n:
        raise ValueError("Number of elements does not match n")
    return nums

def get_max_pairwise_product(nums):
    if len(nums) < 2:
        raise ValueError("Need at least 2 numbers")
    max_product = float("-inf")
    n = len(nums)
    for i in range(n):
        for j in range(i + 1, n):
            max_product = max(max_product, nums[i] * nums[j])
    return max_product


def main():
    nums = read_array()
    print(get_max_pairwise_product(nums))

if __name__ == "__main__":
    main()