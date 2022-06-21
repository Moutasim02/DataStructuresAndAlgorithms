# Binary Search 
- Used for sorted arrays (Ascending or Descending order).

## Steps [Section 1]
  - Find the middle element (start + End / 2 --> integer value)
  - check if target element > middle --> search in right
    - if middle element == target --> return answer
    - else loop again with new middle number (middle +- 1 -> same array)
  - While finding middle number --> (start + (end - start) / 2) so we don't exceed the int value. 

## Why binary search?
 - Best: O(1)
 - Worst: O(log(n))

## How to know if it's _sorted_ in ascending or descending order (order agnostic) [Section 2]?
  - if end > start --> ascending (increasing)
  - else --> decreasing
