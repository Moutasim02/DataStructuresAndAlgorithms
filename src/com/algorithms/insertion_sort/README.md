# Insertion Sort
#### Complexity:
Worst case: O(n^2) ..Descending sorted
<br>
Best case: O(n)

### Brief Steps _(Sort by parts)_
``` java
Within 2 nested for loops with i and j

[5, 3, 4, 1, 2] // Sort first 2 indexes (0 -> 1)
[3, 5, 4, 1, 2] // Put the 3th index in the correct index of LHS
// After first pass, where i = 0, Index (0 -> 1) will be sorted

// After second pass, where i = 1, Index (0 -> 2) will be sorted
[3, 4, 5, 1, 2]
// pass three
[1, 3, 4, 5, 2]
// pass four
[1, 2, 3, 4, 5]
```

### Why?
- Adaptive - steps get reduced if array is sorted
  - number of swaps reduced as compared to bubble sort. 
- Stable
- Used for smaller values of n -> good when array is partially sorted
  - Takes part in hybrid sorting algorithms (Multiple algorithms together).