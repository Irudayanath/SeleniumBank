
 
class Lion implements AnimalGene
{

}
class Cat extends Lion
{
	
}
public class TestAnimalGene
{
public static void main(String args[])
{
	
	Lion t=new Lion();
	Cat c=new Cat();
	System.out.println(t instanceof AnimalGene);
	System.out.println(c instanceof AnimalGene);
	System.out.println(c instanceof Lion);
}

}
