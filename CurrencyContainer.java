
public class CurrencyContainer {

	public static Currency getCurrency(String country)
	{
		if(country.equals("India"))
		{
			return new India();
		}
		else if(country.equals("USA"))
		{
			return new USA();
		}
		else if(country.equals("UK"))
		{
			return new UK();
		}
		else
		{
			throw new IllegalArgumentException("IllegalArgumentException");
		}
	}
}
