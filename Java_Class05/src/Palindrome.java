import java.util.Scanner;

public class Palindrome{


public static void main(String args[])
   {
     String actual;
     int len;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the word to be checked");
     actual = in.nextLine();
     len = actual.length();
     String reverse = "";
     for (int i = len - 1; i >= 0; i--){
    	  reverse = reverse + actual.charAt(i);}
       if (actual.equals(reverse)){
        System.out.println("The given word is a palindrome");}
      else{
         System.out.println("The given word is not a palindrome");}
    }
    	
	//todo: Create a method isPalindrome which takes a String as input and returns true if it is a palindrome and false otherwise.
	//A palindrome is a word which can be read backwards and forwards in the same way., e.g. 'hannah'.
	//Ignore upper and lower case. 'Hannah' is a palindrome, too.
	//Ignore also spaces. 'Taco cat' is a valid palindrome.

}