import java.util.Scanner;

/**
* This program Blow up.

* @author  Andrew Kuekam
* @version 1.0
* @since   Year-Month-Day
*/
 
public class StringStuff {
  
  /**
    * Class String Stuff.
 */
 
  public static void main(String[] args) {
    
    //This read the input from the console
    Scanner userInput = new Scanner(System.in);
    
    //This tells the user to enter the string
    System.out.println("Enter string");
    String userString = userInput.next();
    
    // declare local char and String
    char nextchar;
    char aChar;
    String outputString = " ";
    //String userString = " ";
      
    //This convert the use string into an array of char
    char[] userCharArray = userString.toCharArray();
      
    //This loop the character in the Array
    for (int index = 0; index < userString.length(); index++) {
      // set char to index
      aChar = userCharArray[index];
      
      //aChar is a digit
      if (Character.isDigit(aChar) == false) {
        outputString = outputString + aChar;
      //if aChar is not a digit then append to outputString 
      } else {
        if (index + 1 < userCharArray.length) {
          
          //This get the next Char
          char nextChar = userCharArray[index + 1];
          
          //This determine the numerical value of the character
          int rep = Character.getNumericValue(aChar);
          
          //
          for (int i = 0; i < rep; i++) {
            outputString = outputString + nextChar;
          }
        }
      }
    }
    System.out.println("output is:" + outputString);
  }
}
