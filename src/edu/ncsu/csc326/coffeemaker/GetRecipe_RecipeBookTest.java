package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetRecipe_RecipeBookTest
{

	@Test
	public void testGetRecipes()
	{
		//if the returned object is an array
		RecipeBook recipeBook = new RecipeBook();
		assertTrue(recipeBook.getRecipes() instanceof Recipe []);
	}

}
