public class practiceproblem4 {

public static int fib(int n) {

    if (n==1) return 1; 
    if (n==0) return 0; {

return fib(n-1)+ fib(n-2); // the value of the current number is the sum of the two numbers before
}
}

public static void main(String[] args) {
 int n = 0;
 int result = fib(n);
     System.out.println("Fib 1st: " + result + "!");
     
      n = 1;
 int result2 = fib(n);
     System.out.println("Fib 2nd: " + result2 + "!");
    
     n= 2;
 int result3 = fib(n);
     System.out.println("Fib 3rd: " + result3 + "!");
    
      n = 3;
 int result4 = fib(n);
     System.out.println("Fib 4th: " + result4 + "!");
    
     n = 4;
 int result5 = fib(n);
     System.out.println("Fib 5th: " + result5 + "!");

     n = 5;
 int result6 = fib(n);
     System.out.println("Fib 6th: " + result6 + "!");

     n = 6;
 int result7 = fib(n);
     System.out.println("Fib 7th: " + result7 + "!");

     n = 7;
 int result8 = fib(n);
     System.out.println("Fib 8th: " + result8 + "!");

      n = 8;
 int result9 = fib(n);
     System.out.println("Fib 9th: " + result9 + "!");

      n = 9;
 int result10 = fib(n);
     System.out.println("Fib 10th: " + result10 + "!");
}
}