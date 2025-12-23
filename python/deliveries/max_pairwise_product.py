def max_pairwise_product(numbers):
    if len(numbers) < 2:
        raise ValueError("Need at least 2 numbers")
    max_index1 = -1
    max_index2 = -1

    # First max
    for i in range(len(numbers)):
        if max_index1 == -1 or numbers[i] > numbers[max_index1]:
            max_index1 = i

    # Second max
    for i in range(len(numbers)):
        if i != max_index1 and (max_index2 == -1 or numbers[i] > numbers[max_index2]):
            max_index2 = i

    return numbers[max_index1] * numbers[max_index2]


if __name__ == '__main__':
    _ = int(input())
    input_numbers = list(map(int, input().split()))
    print(max_pairwise_product(input_numbers))
