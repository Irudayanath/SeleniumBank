package FactoryPattern;

public class AnimalFactory {

	/**
	 * @param args
	 */
public RescueAnimals getAnimals(String animals)
{
	if(animals.equalsIgnoreCase("RESCUEDEER"))
	{
		return new RescueDeer();

	}
if(animals.equalsIgnoreCase("RESCUEBULL"))
		{
	return new RescueBull();
		}
return null;

}}
