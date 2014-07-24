package FactoryPattern;

public class RescueAnimalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
AnimalFactory animal=new AnimalFactory();
RescueAnimals rescue= animal.getAnimals("RESCUEBULL");
rescue.walk();
RescueAnimals rescue1= animal.getAnimals("RESCUEDEER");
rescue1.walk();

	
	}}