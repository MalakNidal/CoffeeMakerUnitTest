package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Suger1_RecipeTest
{
	
	@Test 
	public void testGetAmtSugar() throws RecipeException, NumberFormatException
	{
		String amtSugar = "5.0";
		double expected = 5.0;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtSugar(amtSugar);
		actual = objRec.getAmtSugar();
		assertTrue(expected == actual);
	}

	@Test
	public void testSetAmtSugar1() throws RecipeException, NumberFormatException
	{
		//if number is positive
		String amtSugar = "10.0";
		double expected = 10.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtSugar(amtSugar);
		actual = objRec.getAmtSugar();
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtSugar2() throws RecipeException, NumberFormatException
	{
		//if number is negative
		String amtSugar = "-10.0";
		double expected = 10.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtSugar(amtSugar);
		actual = objRec.getAmtSugar();
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtSugar3() throws RecipeException, NumberFormatException
	{
		//if number is zero
		String amtSugar = "0.0";
		double expected = 0.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtSugar(amtSugar);
		actual = objRec.getAmtSugar();
		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtSugar4() throws RecipeException, NumberFormatException
	{
		//if number is string
		String amtSugar = "m";
		double expected = 10.0 ;
		double actual = 0.0;
		Recipe objRec = new Recipe();
		objRec.setAmtSugar(amtSugar);
		actual = objRec.getAmtSugar();
		assertTrue(expected == actual);
	}

}
