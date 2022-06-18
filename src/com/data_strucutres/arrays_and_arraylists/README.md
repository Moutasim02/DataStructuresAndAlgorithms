# Arrays Notes (Section 1)

sections made by me for reference

- Arrays:
  - Mutable
  - Default value for all indexes is zero for int array.
  - Default value for all indexes is null for String array (as any other reference variable).
  - Values can be printed out by for, for-each, and while loop, and Arrays.toString(refVarToArray). 

- Array can store 
  - primitive data types values
  - objects
  - Complex Objects
  - All types should be the same

#### Syntax

``` 
datatype[] variable_name 
/*called reference variable pointing to the right hand side*/ 
= new datatype[size];
```

### How it works?
```
int [] ros; // declaration of array defined in the stack, at compile time
ros [] = new int[5]; // initialization: object is being created in the memory (heap), at runtime
```
##### Internally?
- Reference variable at the stack point into the object in the heap
- Example:
```
[3,8,19,45,7,84,76] The JVM decides if it should be allocated continuously (like C and C++) or not
```
##### What we get from this?

- Array objects are in heap.
- Heap objects are, not continuous.
- Dynamic Memory Allocation (DMA).
- So... It depends on the JVM

### New Keyword
- Used to create an object in the memory (At runtime).
- ``int [] rollNumbers2 = {23,35,78,96,43}; here new happens internally``

[Next](MultiDimensionalArrays.md)