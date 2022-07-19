# Recursion
Space complexity: O(n)

- Function calling itself
- It has a base condition that specifies when to stop making calls
  - if not available -> function calls will keep happening
  - Stack will be filled -> leading to stackoverflow due to exceeding the limit of machine memory

### Why?
- Helps in solving bigger complex problems in simple ways.
- You can convert recursion solutions into iteration & vice versa.
- Space complexity is not constant because of recursive calls.

### When?
- If problem can be broken into smaller ones, like a formula
- Base condition is represented by answers we already have

### How to understand & approach a problem?

- Identify if you can break down problem into smaller problems
- Write the recurrence relation if needed
- Draw the recursive tree
- Understanding the tree
  - See how flow of the functions, how they are getting in stack.
  - Identify & focus on left tree and right tree calls. (Order of execution)
  - Use debugger to understand the execution process.

### Work with variables in recursion
1. Arguments
2. Return Type
3. Body of function

### Types of recurrence relation
1. Linear recurrence relation -> ex: fibonacci (Very slow for high numbers, Use Dynamic Programming instead)
2. Divide and conquer recurrence relation -> ex: Binary search
