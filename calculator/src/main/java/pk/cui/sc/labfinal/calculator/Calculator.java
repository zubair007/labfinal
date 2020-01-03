package pk.cui.sc.labfinal.calculator;

/**
 * 
 * @author Zubair Khakwani
 * Calculator Class which contain three methods 
 * 1) To find greatest num
 * 2) to find square
 * 3) to find cube
 */
public class Calculator {
	
	/**
	 * 
	 * @param num1 1st number for addition
	 * @param num2 2nd number for addition
	 * @param num3 3rd number for addition
	 * @return sum of 3 numbers
	 */
	public int findMax(int num1, int num2, int num3) {
		
		int[] arr = { num1, num2, num3 };
		int max = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	/**
	 * 
	 * @param num Input number to be squared
	 * @return square of input number
	 * @throws IllegalArgumentException when the input integer is greater less than <code>0</code> or greater than <code>10</code>

	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else
			throw new IllegalArgumentException();
		return result;
	}
	
	/**
	 * 
	 * @param val input parameter to be cubed
	 * @return cube of input number
	 */
	public int cube(int val)
	{
		return val*val*val;
	}
}
