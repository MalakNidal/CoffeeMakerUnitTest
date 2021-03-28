package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Equals1_RecipeTest
{

	@Test (expected = RecipeException.class)
	public void testEqualsObject1() throws RecipeException, NumberFormatException
	{
		//if object1 = object2 
		Object obj1 = new Object();
		Object obj2 = new Object();
		boolean expected = true;
		boolean actual = obj1.equals(obj2);
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testEqualsObject2() throws RecipeException, NumberFormatException
	{
		//if object1 != object2 
		Object obj1 = new Object();
		Object obj2 = new Object();
		boolean expected = true;
		boolean actual = obj1.equals(obj2);
		assertTrue(expected != actual);
	}

}
