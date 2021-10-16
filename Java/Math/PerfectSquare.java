/* Java program to find if x is a
 perfect square.
 
Approach:
Take the square root of the number.
Multiply the square root twice
Use boolean equal operator to verify if the product of square root is equal to the number given.
 
 */
class PerfectSquare {

	static boolean isPerfectSquare(int x)
	{
		if (x >= 0) {

			int sr = (int)Math.sqrt(x);
			
			return ((sr * sr) == x);
		}
		return false;
	}

	public static void main(String[] args)
	{
		int x = 2502;

		if (isPerfectSquare(x))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}

