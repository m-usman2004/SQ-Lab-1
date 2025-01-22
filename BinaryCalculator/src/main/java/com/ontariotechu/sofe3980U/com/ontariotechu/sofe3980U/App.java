package com.ontariotechu.sofe3980U;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {

		Binary binary1 = new Binary("1100");
		Binary binary2 = new Binary("1010");

		Binary binary3 = new Binary("1110");
		Binary binary4 = new Binary("10110");

		Binary ORAnswer = binary1.OR(binary2);
		System.out.println("Or answer: " + ORAnswer.getValue());

		Binary ORAnswer2 = binary3.OR(binary4);
		System.out.println("Or answer: " + ORAnswer2.getValue());

		Binary ANDAnswer = binary1.AND(binary2);
		System.out.println("AND answer: " + ANDAnswer.getValue());

		Binary ANDAnswer2 = binary3.AND(binary4);
		System.out.println("AND answer: " + ANDAnswer2.getValue());

		Binary MultiplyAnswer = binary1.Multiply(binary2);
		System.out.println("Multiply answer: " + MultiplyAnswer.getValue());

		Binary MultiplyAnswer2 = binary3.Multiply(binary4);
		System.out.println("Multiply2 answer: " + MultiplyAnswer2.getValue());
    }
}
