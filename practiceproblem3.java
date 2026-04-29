public class practiceproblem3 {

public static int sumGrid(int[][] grid) {


    int total = 0;

for (int i = 0; i< grid.length; i++) {
    for ( int m = 0;  m < grid[i].length; m++ ){
    total= grid[i][m]+ total;
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