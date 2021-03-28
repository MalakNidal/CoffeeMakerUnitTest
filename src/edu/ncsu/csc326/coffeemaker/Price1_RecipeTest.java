package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Price1_RecipeTest
{
	
	@Test 
	public void testGetPrice() throws RecipeException, NumberFormatException
	{
		String price = "5.0";
		double expected = 5.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setPrice(price);
		actual = objRec.getPrice();
		assertTrue(expected == actual);
	}

	@Test 
	public void testSetPrice1() throws RecipeException, NumberFormatException
	{
		//if the price is positive
		String price = "5.0";
		double expected = 5.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setPrice(price);
		actual = objRec.getPrice();
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetPrice2() throws RecipeException, NumberFormatException
	{
		//if the price is negative
		String price = "-5.0";
		double expected = 0.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setPrice(price);
		actual = objRec.getPrice();
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetPrice3() throws RecipeException, NumberFormatException
	{
		//if the price is zero
		String price = "0.0";
		double expected = 0.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setPrice(price);
		actual = objRec.getPrice();
		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetPrice4() throws RecipeException, NumberFormatException
	{
		//if the price is string
		String price = "m";
		double expected = 0.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setPrice(price);
		actual = objRec.getPrice();
		assertTrue(expected == actual);
	}
}
