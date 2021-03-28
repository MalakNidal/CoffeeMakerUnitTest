package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Coffee1_RecipeTest
{
	
	@Test 
	public void testGetAmtCoffee() throws RecipeException, NumberFormatException
	{
		String amtCoffee = "5.0";
		double expected = 5.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtCoffee(amtCoffee);
		actual = objRec.getAmtCoffee();
		assertTrue(expected == actual);
	}

	@Test
	public void testSetAmtCoffee1() throws RecipeException, NumberFormatException
	{
		//if the number is positive
		String amtCoffee = "10.0";
		double expected = 10.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtCoffee(amtCoffee);
		actual = objRec.getAmtCoffee();
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtCoffee2() throws RecipeException, NumberFormatException
	{
		//if the number is negative
		String amtCoffee = "-10.0";
		double expected = 0.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtCoffee(amtCoffee);
		actual = objRec.getAmtCoffee();
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtCoffee3() throws RecipeException, NumberFormatException
	{
		//if the number is zero
		String amtCoffee = "0.0";
		double expected = 0.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtCoffee(amtCoffee);
		actual = objRec.getAmtCoffee();
		assertTrue(expected == actual);	
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtCoffee4() throws RecipeException, NumberFormatException
	{
		//if the number is string
		String amtCoffee = "m";
		double expected = 0.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtCoffee(amtCoffee);
		actual = objRec.getAmtCoffee();
		System.out.println(actual);
		assertTrue(expected == actual);
	}

}
