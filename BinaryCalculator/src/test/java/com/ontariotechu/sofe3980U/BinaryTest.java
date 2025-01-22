package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    /**
     * Test the OR function with one of the numbers being a 0
     */
    @Test
    public void OR1()
    {
        Binary binary1=new Binary("1110");
        Binary binary2=new Binary("0000");
        Binary binary3=binary1.OR(binary2);
        assertTrue( binary3.getValue().equals("1110"));
    }

    /**
     * Test the OR function with one of the numbers being longer than the other
     */
    @Test
    public void OR2()
    {
        Binary binary1=new Binary("1100");
        Binary binary2=new Binary("111101");
        Binary binary3=binary1.OR(binary2);
        assertTrue( binary3.getValue().equals("111101"));
    }

    /**
     * Test the OR function with one of the numbers having leading zeroes
     */
    @Test
    public void OR3()
    {
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("00000000001011");
        Binary binary3=binary1.OR(binary2);
        assertTrue( binary3.getValue().equals("1011"));
    }

    /**
     * Test the AND function with 2 different length numbers
     */
    @Test
    public void AND1()
    {
        Binary binary1=new Binary("1100");
        Binary binary2=new Binary("10001");
        Binary binary3=binary1.AND(binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    /**
     * Test the AND function with a number that is 0
     */
    @Test
    public void AND2()
    {
        Binary binary1=new Binary("1100");
        Binary binary2=new Binary("0000");
        Binary binary3=binary1.AND(binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    /**
     * Test the AND function with 2 numbers that are the same length
     */
    @Test
    public void AND3()
    {
        Binary binary1=new Binary("1100");
        Binary binary2=new Binary("1010");
        Binary binary3=binary1.AND(binary2);
        assertTrue( binary3.getValue().equals("1000"));
    }

    /**
     * Test the multiply function with the same length numbers
     */
    @Test
    public void Multiply1()
    {
        Binary binary1=new Binary("1");
        Binary binary2=new Binary("1");
        Binary binary3=binary1.Multiply(binary2);
        assertTrue( binary3.getValue().equals("1"));
    }

    /**
     * Test the multiply function with one number that has only 0's
     */
    @Test
    public void Multiply2()
    {
        Binary binary1=new Binary("1011");
        Binary binary2=new Binary("0000");
        Binary binary3=binary1.Multiply(binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    /**
     * Test the multiply function with 2 different length numbers
     */
    @Test
    public void Multiply3()
    {
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1000");
        Binary binary3=binary1.Multiply(binary2);
        assertTrue( binary3.getValue().equals("1000000"));
    }

}
