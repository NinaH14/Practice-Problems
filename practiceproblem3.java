public class practiceproblem3 {

public static int sumGrid(int[][] grid) {


    int total = 0;

for (int i = 0; i< grid.length; i++) { // go through each row of the grid
    for ( int m = 0;  m < grid[i].length; m++ ){ //inside that row, loop through every column or individual box
    total= grid[i][m]+ total;  // add value of the box to total, and move to the next box
    }

}
return total;
}

public static void main(String[] args) {

int[][] myGrid  = {
 {1,2,3,4,5,6,7,8,9,0},
 {3,5,2,5,6,8,9,3,4,5},
 {1,2,3,4,5,6,7,8,9,0}
};

 int Result =  sumGrid(myGrid);
System.out.println ("The sum of the Grid:" + Result + "!");

}
}