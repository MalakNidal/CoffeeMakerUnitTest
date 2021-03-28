package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

/**
 * @author   Sarah Heckman
 */
public class Recipe
{
	//we will convert all the data type of the variables to double
    private String name;
    private double price;
    private double amtCoffee;
    private double amtMilk;
    private double amtSugar;
    private double amtChocolate;
    
    
    /**
     * Creates a default recipe for the coffee maker.
     */
    public Recipe()
    {
    	//change variable values from int (0) to double (0.0)
    	this.name = "";
    	this.price = 0.0;
    	this.amtCoffee = 0.0;
    	this.amtMilk = 0.0;
    	this.amtSugar = 0.0;
    	this.amtChocolate = 0.0;
    }
    
    /**
	 * @return   Returns the amtChocolate.
	 */
    //change the function return type from int to double 
    public double getAmtChocolate()
    {
		return amtChocolate;
	}
    
    /**
	 * @param amtChocolate   The amtChocolate to set.
	 */
  //change the variables type from int to double
    public void setAmtChocolate(String chocolate) throws RecipeException, NumberFormatException
    {
    	double amtChocolate = 0.0;
    	try
    	{
    		amtChocolate = Double.parseDouble(chocolate);
    	}
    	catch (NumberFormatException e)
    	{
    		throw new NumberFormatException("Error in parsing amount of chocolate");
    	}
    	
		if (amtChocolate >= 0.0)
		{
			this.amtChocolate = amtChocolate;
		}
		else
		{
			throw new RecipeException("Units of chocolate must be a positive integer");
		}
	}
    
    /**
	 * @return   Returns the amtCoffee.
	 */
  //change the function return type from int to double
    public double getAmtCoffee()
    {
		return amtCoffee;
	}
    
    /**
	 * @param amtCoffee   The amtCoffee to set.
	 */
  //change the variables type from int to double
    public void setAmtCoffee(String coffee) throws RecipeException
    {
    	double amtCoffee = 0.0;
    	try
    	{
    		amtCoffee = Double.parseDouble(coffee);
    	}
    	catch (NumberFormatException e)
    	{
    		throw new NumberFormatException("Error in parsing amount of coffee");
    	}
    	
		if (amtCoffee >= 0.0)
		{
			this.amtCoffee = amtCoffee;
		}
		else
		{
			throw new RecipeException("Units of coffee must be a positive integer");
		}
	}
    
    /**
	 * @return   Returns the amtMilk.
	 */
  //change the function return type from int to double
    public double getAmtMilk()
    {
		return amtMilk;
	}
    
    /**
	 * @param amtMilk   The amtMilk to set.
	 */
  //change the variables type from int to double
    public void setAmtMilk(String milk) throws RecipeException
    {
    	double amtMilk = 0.0;
    	try
    	{
    		amtMilk = Double.parseDouble(milk);
    	}
    	catch (NumberFormatException e)
    	{
    		throw new NumberFormatException("Error in parsing amount of milk");
    	}
    	
		if (amtMilk >= 0.0)
		{
			this.amtMilk = amtMilk;
		}
		else
		{
			throw new RecipeException("Units of milk must be a positive integer");
		}
	}
    
    /**
	 * @return   Returns the amtSugar.
	 */
  //change the function return type from int to double
    public Double getAmtSugar()
    {
		return amtSugar;
	}
    
    /**
	 * @param amtSugar   The amtSugar to set.
	 */
  //change the variables type from int to double
    public void setAmtSugar(String sugar) throws RecipeException
    {
    	Double amtSugar = 0.0;
    	try
    	{
    		amtSugar = Double.parseDouble(sugar);
    	}
    	catch (NumberFormatException e)
    	{
    		throw new NumberFormatException("Error in parsing amount of suger");
    	}
    	
		if (amtSugar >= 0.0)
		{
			this.amtSugar = amtSugar;
		}
		else
		{
			throw new RecipeException("Units of sugar must be a positive integer");
		}
	}
    
    /**
	 * @return   Returns the name.
	 */
    public String getName()
    {
		return name;
	}
    
    /**
	 * @param name   The name to set.
	 */
    public void setName(String name)
    {
    	if(name != null)
    	{
    		this.name = name;
    	}
	}
    
    /**
	 * @return   Returns the price.
	 */
  //change the function return type from int to double
    public Double getPrice()
    {
		return price;
	}
    
    /**
	 * @param price2   The price to set.
	 */
  //change the variables type from int to double
    public void setPrice(String price2) throws RecipeException
    {
    	Double amtPrice = 0.0;
    	try
    	{
    		amtPrice = Double.parseDouble(price2);
    	}
    	catch (NumberFormatException e)
    	{
    		throw new NumberFormatException("Error in parsing amount of price");
    	}
    	
		if (amtPrice >= 0.0)
		{
			this.price = amtPrice;
		}
		else
		{
			throw new RecipeException("Price must be a positive integer");
		}
	} 
    
    /**
     * Returns the name of the recipe.
     * @return String
     */
    public String toString()
    {
    	return name;
    }

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		final Recipe other = (Recipe) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		
		return true;
	}

}
