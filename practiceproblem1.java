public class practiceproblem1{

public static int countOccurrences (int arr[],int n) { //Counts how many times the number n appears in the array
    int count = 0; // start count at 0
 int m = 0;
for (m = 0; m < arr.length; m++) // Go through every number in the list one by one
    if ( arr[m] == n) { //If the current number matches the one we are looking for, add 1 to our count
     count++; }
     return count;
    }
public static void main(String[] args) { // Everything in here happens as soon as you hit "Run"
    int[] arr = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
    int result = countOccurrences(arr, 1);
     System.out.println("The number 1 appears: " + result + " times.");

    int[] arr2 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
    int result2= countOccurrences(arr2, 2);
     System.out.println("The number 2 appears: " + result2 + " times.");
     
     
     int[] arr3 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
    int result3= countOccurrences(arr3, 3);
     System.out.println("The number 3 appears: " + result3 + " times.");
     
     int[] arr4 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
     int result4= countOccurrences(arr4, 4);
     System.out.println("The number 4 appears: " + result4 + " times.");

     int[] arr5 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
     int result5= countOccurrences(arr5, 5);
     System.out.println("The number 5 appears: " + result5 + " times.");

     int[] arr6 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
    int result6= countOccurrences(arr6, 6);
     System.out.println("The number 6 appears: " + result6 + " times.");

     int[] arr7 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
    int result7= countOccurrences(arr7, 7);
     System.out.println("The number 7 appears: " + result7 + " times.");

     int[] arr8 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
    int result8= countOccurrences(arr8, 8);
     System.out.println("The number 8 appears: " + result8 + " times.");

     int[] arr9 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
    int result9= countOccurrences(arr9, 9);
     System.out.println("The number 9 appears: " + result9 + " times.");

     int[] arr0 = {0, 1, 1, 0, 7, 9, 7, 5, 6, 5, 4, 2,  0, 1, 0, 2, 2, 1, 7, 9, 0, 4, 5, 6, 3, 2, 3, 0, 2, 0, 3, 2, 1, 0, 7, 5, 7, 7, 4, 9, 1, 0, 2, 1, 2, 0, 7, 9, 6, 5, 9, 6, 0, 3, 4, 6, 4, 7, 6, 5, } ;
    int result0= countOccurrences(arr0, 0);
     System.out.println("The number 0 appears: " + result0 + " times.");

     
}
}