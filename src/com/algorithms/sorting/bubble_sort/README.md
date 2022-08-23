# Bubble sort (aka Sinking/ Exchange sort)
Complexity:
Space complexity => O(1) (In-place sorting algorithm)
Time complexity => Best: O(n) => sorted, Worst: O(n^2) => sorted in opposite


### Steps
Every step (example: index 0 to 1) compare adjacent elements
Example: 
``` java
[3, 1, 5, 4, 2] // Check first two elements
[1, 3, 5, 4, 2] // Check next two elements, 3 > 5? if yes, swap, then check next two indexes
[1, 3, 4, 5, 2] // Check last two indexes
[1, 3, 4, 2, 5] // Next pass start
[1, 3, 2, 4, 5] // Repeat...
[1, 2, 3, 4, 5] // Done.
```
### Why?
- With the first pass through the array, the largest element come to the end.
