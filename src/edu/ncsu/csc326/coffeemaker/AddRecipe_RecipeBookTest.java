package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AddRecipe_RecipeBookTest
{
	
	@Before
	public void Prepare() throws NumberFormatException, RecipeException
	{
		Recipe rec1 = new Recipe();
		rec1.setName("Coffee");
		rec1.setAmtChocolate("0");
		rec1.setAmtCoffee("5");
		rec1.setAmtMilk("0");
		rec1.setAmtSugar("0");
		rec1.setPrice("20");
		
		Recipe rec2 = new Recipe();
		rec2.setName("Nescafee");
		rec2.setAmtChocolate("0");
		rec2.setAmtCoffee("3");
		rec2.setAmtMilk("1");
		rec2.setAmtSugar("1");
		rec2.setPrice("30");
		
		Recipe rec3 = new Recipe();
		rec3.setName("Hot Chocolate");
		rec3.setAmtChocolate("5");
		rec3.setAmtCoffee("0");
		rec3.setAmtMilk("1");
		rec3.setAmtSugar("2");
		rec3.setPrice("50");
	}

	@Test
	public void testAddRecipe1()
	{
		Recipe rec2 = new Recipe();
		RecipeBook recipeBook = new RecipeBook();
	}

}
