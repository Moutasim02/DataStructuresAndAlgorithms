# Cyclic Sort
Worst case: O(n)
Best case: O()

### When to use?
- When given numbers from range 1 -> n, and we need to find specific number => Use Cyclic Sort

### Steps
As long as we have a range of numbers from 1 -> n
- We swap the number with index value - 1 if it's not there already
- **Example: worst case**
``` java
[3, 5, 2, 1, 4] // index 0 value belongs to i - 1, swap
[2, 5, 3, 1, 4] // check swapped index(previously i - 1) if it's in correct position, in this case no
[5, 2, 3, 1, 4] // check swapped value again, index 0 in this case
[4, 2, 3, 1, 5] // index 0 in this case is in correct index? no, therfore swap
[1, 2, 3, 4, 5] // Check all indexes values
```
