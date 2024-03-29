package cse360assign2;
/**
 * Public Class AddingMachine, a set of methods that when called either add or subtract to the total, 
 * return the total value, return the string verion of the expressions that are occuring. 
 * There is also a clear method that clears the variables
 * Date: 10/1/19
 * @author Jeffrey Ciferno
 * ASU Email: jmcifern@asu.edu
 * ASU ID: 1217664240
 * Class Number: 70642
 * Github link: https://github.com/jeffreyciferno/CSE360/tree/master/CSE360/src/cse360assign2
 */

public class AddingMachine {

	private int total;
	private String tracker = "";
	/**
	 * Method AddingMachine constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		tracker = tracker + "0";
	}
	/**
	 * Method getTotal, Gets and returns the current state of int total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Method add, Adds the inputed variable value to the int total.
	 * @param value
	 */
	public void add (int value) {
	total = total + value;
	tracker = tracker + " + " + value;
	}
	
	/**
	 * Method subtract, subtracts the inputed variable value from the int total.
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		tracker = tracker + " - " + value;
	}
	
	/**
	 * Method toString, adds the string from each method then returns the complete string back to toString
	 * @return tracker
	 */
	public String toString () {
		return tracker;
	}
	
	/**
	 * Method clear, clears both the total and toString values.
	 */
	public void clear() {
	total = 0;
	tracker = "";

	}
}
