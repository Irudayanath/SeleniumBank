

class Animal
{
	public void Herbi()
	{
		System.out.println("Animals Eating Plants");
	}
	public void Carni()
	{
		System.out.println("Animals Eating Meat");
	}
	
	public void young() {
		// TODO Auto-generated method stub
		
	}
}
class Tiger extends Animal
{
	public void Carni()
	{
		System.out.println("Tiger is Carnivorus");
	}
}
class Tigercub extends Tiger
{
	public void young()
	{
		System.out.println("TigerPub are Young");
	}
}
public class UserLogin {
public static void main(String args[])
{
	Animal a=new Animal();
	a=new Tiger();
	a=new Tigercub();
	a.Carni();
	a.Herbi();
	a.young();
}
}
