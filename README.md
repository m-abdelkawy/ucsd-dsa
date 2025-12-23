# UCSD Data Structures and Algorith Specialization

Solutions and notes for [Data Structures and Algorithms Specialization](https://www.coursera.org/specializations/data-structures-algorithms) by UC San Diego.

## Structure

```
├── python/              # Python implementations
│   └── course1_toolbox/
├── java/ucsd-dsa/      # Java implementations (Gradle multi-module)
│   ├── course1_toolbox/
│   ├── course2_data_structures/
│   ├── course3_algorithms_on_graphs/
│   ├── course4_strings/
│   ├── course5_advanced_algorithms/
│   └── course6_capstone/
```

## Course 1: Algorithmic Toolbox

**Status** In progress

### Week 1: Programming Challenges
- [x] `P001_APlusB` - Warmup problem
- [x] `P002_MaxPairwiseProduct` - Naive O(n²) solution
- [x] `P002_MaxPairwiseProduct` - Optimized O(n) solution
- [x] `P003_MaxPairwiseProductStressTest`

### Week 2: Algorithmic Warm-up
- [ ] Fibonacci Numbers
- [ ] Last Digit of Fibonacci
- [ ] GCD
- [ ] LCM
- [ ] Fibonacci Huge

### Week 3: Greedy Algorithms
- [ ] Money Change
- [ ] Maximum Value of Loot
- [ ] Car Fueling
- [ ] Maximum Advertisement Revenue
- [ ] Collecting Signatures

### Week 4: Divide and Conquer
- [ ] Binary Search
- [ ] Majority Element
- [ ] Improving QuickSort
- [ ] Number of Inversions
- [ ] Points and Segments

### Week 5: Dynamic Programming 1
- [ ] Money Change Again
- [ ] Primitive Calculator
- [ ] Edit Distance
- [ ] LCS of Two Sequences
- [ ] LCS of Three Sequences

### Week 6: Dynamic Programming 2
- [ ] Maximum Amount of Gold
- [ ] Partitioning Souvenirs
- [ ] Maximum Value of Arithmetic Expression

## Running the Code

### Java
```bash
cd java/ucsd-dsa
./gradlew :course1_toolbox:run
./gradlew :course1_toolbox:test
```

### Python
```bash
cd python/course1_toolbox
python P002_1_MaxPairwiseProductNaive.py < input.txt
```

## Study Notes

### Key Concepts
- **Time Complexity**: Big O notation for algorithm analysis
- **Space Complexity**: Memory usage patterns
- **Stress Testing**: Generate random inputs to find edge cases

### Problem-Solving Approach
1. Understand the problem constraints
2. Implement naive solution first
3. Analyze time/space complexity
4. Optimize if needed
5. Stress test against naive solution

## Resources
- [Course Materials](https://www.coursera.org/specializations/data-structures-algorithms)
- [Algorithm Visualizations](https://visualgo.net/)
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)

## License
MIT