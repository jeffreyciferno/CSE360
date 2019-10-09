package Assignment1;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Public class PalindromeTest, A series of test cases that test code functionality
 * @author Jeffrey Ciferno
 * Date: 10/1/19
 */
public class PalindromeTest {

	@Test
	public void test() {
		Palindrome test1 = new Palindrome(); //Creates an instancce of Palindrome called test1
		test1.Palindrome("///....Kayak."); //inputString into Palindrome method
		assertEquals(true, test1.isPalindrome()); //Compares the projected output to actual output
	}
	
	@Test
	public void test1() {
		Palindrome test2 = new Palindrome(); //Creates an instancce of Palindrome called test2
		test2.Palindrome("thiswillfail"); //inputString into Palindrome method
		assertEquals(false, test2.isPalindrome()); //Compares the projected output to actual output
	}
	
	@Test
	public void test2() {
		Palindrome test3 = new Palindrome(); //Creates an instancce of Palindrome called test3
		test3.Palindrome("race car"); //inputString into Palindrome method
		assertEquals(true,test3.isPalindrome()); //Compares the projected output to actual output
	}
	
	@Test
	public void test3() {
		Palindrome test4 = new Palindrome(); //Creates an instancce of Palindrome called test4
		test4.Palindrome("THISWILLBEASECONDFAILURE"); //inputString into Palindrome method
		assertEquals(false,test4.isPalindrome()); //Compares the projected output to actual output
	}
	
	@Test
	public void test4() {
		Palindrome test5 = new Palindrome(); //Creates an instancce of Palindrome called test5
		test5.Palindrome(""); //inputString into Palindrome method
		assertEquals(false,test5.isPalindrome()); //Compares the projected output to actual output
	}
}
