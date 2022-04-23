# MultiDimensional Arrays (Section 2)

## 2.1
```
int [][] twoDArray = { //main array
                {1,2,3}, // each on some part of the heap
                {4,5,6},
                {7,8,9}
        };
```
- It is called array of arrays
- twoDArray is reference variable stored in the stack

### How columns aren't necessary?
- you can say something like this...
```
int [][] arr = new int[3][];
//or
int [][] twoDArray = {
                {1,2,3},
                {4,5},
                {6, 7,8,9}
        };
```

Note: arr.length gives you the number of rows
### 2.2 Looping through rows and columns
For the input code, we took each array element from input, Process:
- The arr initialized as 3x3 matrix
- First for loop is for rows and the second is for columns
- the .length in first loop gets number of rows, so we iterate based on it's value.
- arr[row].length gets the number of elements inside the row, thus it's dynamic.

[Next](ArrayList.md)