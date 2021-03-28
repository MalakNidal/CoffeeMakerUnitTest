package edu.ncsu.csc326.coffeemaker;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class Chocolate1_RecipeTest extends TestCase
{
	
	@Test 
	public void testGetAmtChocolate() throws RecipeException, NumberFormatException
	{
		String amtChocolate = "5.0";
		double expected = 5.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtChocolate(amtChocolate);
		actual = objRec.getAmtChocolate();
		assertTrue(expected == actual);
	}

	@Test
	public void testSetAmtChocolate1() throws RecipeException, NumberFormatException
	{
		//if the number is positive
		String amtChocolate = "5.0";
		double expected = 5.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtChocolate(amtChocolate);
		actual = objRec.getAmtChocolate();
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtChocolate2() throws RecipeException, NumberFormatException
	{
		//if the number is negative
		String amtChocolate = "-5.0";
		double expected = 0.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtChocolate(amtChocolate);
		System.out.print("**********");
		actual = objRec.getAmtChocolate();
		System.out.println(actual);
		assertTrue(expected == actual);
	}
	
	
	@Test
	public void testSetAmtChocolate3() throws RecipeException, NumberFormatException
	{
		//if the number is zero
		String amtChocolate = "0.0";
		double expected = 0.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtChocolate(amtChocolate);
		actual = objRec.getAmtChocolate();
		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtChocolate4() throws RecipeException, NumberFormatException
	{
		//if the number is string
		String amtChocolate = "m";
		double expected = 0.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtChocolate(amtChocolate);
		actual = objRec.getAmtChocolate();
		System.out.println(actual);
		assertTrue(expected == actual);
	}

}

