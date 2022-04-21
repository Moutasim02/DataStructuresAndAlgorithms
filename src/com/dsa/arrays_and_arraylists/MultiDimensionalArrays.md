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


