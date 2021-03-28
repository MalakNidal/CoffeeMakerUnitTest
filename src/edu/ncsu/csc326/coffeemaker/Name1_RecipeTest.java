package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Name1_RecipeTest {

	@Test (expected = RecipeException.class)
	public void testSetName1() throws RecipeException
	{
		//if the string = NULL
		String name = "Ali";
		Recipe objRec = new Recipe();
		objRec.setName(name);
		assertNull(objRec.getName() == null);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetName2() throws RecipeException
	{
		//if the string = not NULL
		String name = "Ali";
		Recipe objRec = new Recipe();
		objRec.setName(name);
		assertNotNull(objRec.getName() != null);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetName3() throws RecipeException
	{
		//if the name entered in a wrong format
		String name = "";
		String expected = "0.0";
		String actual = "";
		Recipe objRec = new Recipe();
		objRec.setName(name);
		actual = objRec.getName();
		assertTrue(expected == actual);
	}

}
