public class practiceproblem2butforwords {
   
    public static char[] reversText(String input) {
    
    int m = 0;

    char[] letters = input.toCharArray();
     char[] reversed = new char[letters.length];

     
     for (m = 0; m <  letters.length; m++) { 
    reversed[m] = letters[letters.length - 1 - m];
}
    return reversed ; 
    }

public static void main(String[] args) {
String Text = "Pneumonoultramicroscopicsilicovolcanoconiosis ";
 char[]result = reversText( Text );
     System.out.println("The word reverse is: " + new String(result) + "!");

     
String Text1 = "Is a the longest word in the dictionary ";
 char[]result1 = reversText( Text1 );
     System.out.println("The word reverse is: " + new String(result1) + "!");
}
     
}
    

