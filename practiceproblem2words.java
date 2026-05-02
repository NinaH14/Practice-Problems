public class practiceproblem2words {
   
    public static char[] reversText(String input) {
    
    int m = 0;

    char[] letters = input.toCharArray(); // turn words into an array of individual letters and characters
     char[] reversed = new char[letters.length]; // create an new array that can hold the reverse order of the original array

     
     for (m = 0; m <  letters.length; m++) { // go through array of the letters on by one, first to last
    reversed[m] = letters[letters.length - 1 - m]; // putting the last letter of the original array and putting it in the first spot of the new reverse array
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
    

