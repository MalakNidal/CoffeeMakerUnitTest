package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class ToString_RecipeTest
{

	@Test
	public void testToString1() throws RecipeException, NumberFormatException
	{
		//if name not equal null
		String name = "ali";
		String expected = "";
		String actual = "";
		Recipe objRec = new Recipe();
		objRec.setName(name);
		actual = objRec.getName();
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class) 
	public void testToString2() throws RecipeException, NumberFormatException
	{
		//if name equal null
		String name = null;
		String expected = "";
		String actual = "";
		Recipe objRec = new Recipe();
		objRec.setName(name);
		actual = objRec.getName();
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class) 
	public void testToString3() throws RecipeException, NumberFormatException
	{
		//if name equal number
		String name = "658";
		String expected = "";
		String actual = "";
		Recipe objRec = new Recipe();
		objRec.setName(name);
		actual = objRec.getName();
		assertTrue(expected == actual);
	}

}
