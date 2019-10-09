package Assignment1;
/**
 * Public Class Palindrome, a set of methods that take in an input string and compute if the said string is a Palindrome.
 * Date: 10/1/19
 * @author Jeffrey Ciferno
 * 
 */
public class Palindrome {
	
	private String testString;
	boolean trigger = true;  //sets boolean trigger to a base case of true
	/**
	 * Palindrome method, takes an input string testString and determines if it is a palindrome.
	 * @param testString
	 */
	public void Palindrome(String testString)
	{	
		testString = testString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //replaces periods and spaces
		int length = testString.length(); //sets length to testString.length
		int i = 0; //iteratable
		int j = length - 1; //subtracts the null character from the end of string, iteratable
		
		if (testString == "")
		{
		trigger = false; //sets trigger to false if testString is an empty string
		}
		
		while(j>i)
		{
			/*
			if (inputString.charAt(i++) == inputString.charAt(j--))
			{
			//does nothing if they were equal
			}
			else
			{
			trigger = false; //sets boolean trigger to false if one comparison is false
			}	
			*/
			
			if (testString.charAt(i++) != testString.charAt(j--)) // Does the same as above commented function
			{
			trigger = false; //sets trigger to false if one char is no equal to the other
			}
			
		}
	}
	/**
	 * isPalindrome method, returns a boolean with whatever state the boolean trigger has.
	 * @return
	 */
	public Boolean isPalindrome()
	{	
	return trigger; //returns trigger
	}
}

