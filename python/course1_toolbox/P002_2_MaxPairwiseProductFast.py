def read_array():
    n = int(input())
    nums = list(map(int, input().split()))
    if len(nums) != n:
        raise ValueError("Number of elements does not match n")
    return nums

def get_max_pairwise_product(nums):
    if len(nums) < 2:
        raise ValueError("Need at least 2 numbers")
    max_index1 = -1
    max_index2 = -1

    # First max
    for i in range(len(nums)):
        if max_index1 == -1 or nums[i] > nums[max_index1]:
            max_index1 = i

    # Second max
    for i in range(len(nums)):
        if i != max_index1 and (max_index2 == -1 or nums[i] > nums[max_index2]):
            max_index2 = i

    return nums[max_index1] * nums[max_index2]


def main():
    nums = read_array()
    print(get_max_pairwise_product(nums))

if __name__ == "__main__":
    main()