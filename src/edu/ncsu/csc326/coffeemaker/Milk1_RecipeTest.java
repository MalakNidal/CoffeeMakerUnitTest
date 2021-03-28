package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Milk1_RecipeTest
{
	
	@Test 
	public void testGetAmtMilk() throws RecipeException, NumberFormatException
	{
		String amtMilk = "5.0";
		double expected = 5.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtMilk(amtMilk);
		actual = objRec.getAmtMilk();
		assertTrue(expected == actual);
	}

	@Test
	public void testSetAmtMilk1() throws RecipeException, NumberFormatException
	{
		//if number is positive
		String amtMilk = "10.0";
		double expected = 10.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtMilk(amtMilk);
		actual = objRec.getAmtMilk();
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtMilk2() throws RecipeException, NumberFormatException
	{
		//if number is negative
		String amtMilk = "-10.0";
		double expected = 0.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtMilk(amtMilk);
		actual = objRec.getAmtMilk();
		assertTrue(expected == actual);
	}
	
	@Test 
	public void testSetAmtMilk3() throws RecipeException, NumberFormatException
	{
		//if number is zero
		String amtMilk = "0.0";
		double expected = 0.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtMilk(amtMilk);
		actual = objRec.getAmtMilk();
		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtMilk4() throws RecipeException, NumberFormatException
	{
		//if number is string
		String amtMilk = "m";
		double expected = 10.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtMilk(amtMilk);
		actual = objRec.getAmtMilk();
		System.out.println(actual);
		assertTrue(expected == actual);
	}

}
