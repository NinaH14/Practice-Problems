public class practiceproblem2{

public static int[] reverseArray(int arr[]) {
    
    int m = 0;
     int[] reversed = new int[arr.length];

     for (m = 0; m <  arr.length; m++) { 
    reversed[m] = arr[arr.length - 1 - m];
}
    return reversed;
    }

public static void main(String[] args) {
 int[] arr = {1,2,3,4,5,6,7,8,9,0,9,8,7,6,4,3,2,1,0,0,0};
 int[] result = reverseArray(arr); 
     System.out.println("The reverse array is: " + java.util.Arrays.toString(result) + "!");
     
     
}
}