//**************************************************************
//Steven Smail
//StringMethods.java
//
//Output and combine two user entered phrases and modify and
//analyze the number of characters in the composite string.
//**************************************************************
import java.util.Scanner;

public class StringMethods
{
  public static void main(String[] args)
   { 
    String stringA, stringB, composite;

    Scanner scan = new Scanner (System.in);

    //Enter the first phrase
    System.out.println("Please enter the first phrase: ");
    stringA = scan.nextLine();

    //Enter the second phrase
    System.out.println("Please enter the second phrase: ");
    stringB = scan.nextLine();

    //First phrase character count
    int countA = stringA.length();
    System.out.println("String A has " + countA + " characters.");

    //Second phrase character count    
    int countB = stringB.length();
    System.out.println("String B has " + countB + " characters.");

    //Composite creation
    composite = stringA.concat(" " + stringB);
    System.out.println(composite);

    //Composite count
    int countComposite = composite.length();
    System.out.println("The composite string has " + countComposite +
    " characters.");

    //Vowel substitution
    String asterisk1 =
    composite.replace('A','*');
    String asterisk2 =
    asterisk1.replace('E','*');
    String asterisk3 =
    asterisk2.replace('I','*');
    String asterisk4 =
    asterisk3.replace('O','*');
    String asterisk5 =
    asterisk4.replace('U','*');
    String asterisk6 =
    asterisk5.replace('a','*');
    String asterisk7 =
    asterisk6.replace('e','*');
    String asterisk8 =
    asterisk7.replace('i','*');
    String asterisk9 =
    asterisk8.replace('o','*');
    String asterisk10 =
    asterisk9.replace('u','*');

    System.out.println(asterisk10);

    //First vowel occurrence
    int pos = asterisk10.indexOf('*');
    System.out.println("The first vowel is at position " + pos);

   }
}
