 class Automobile
{
	public void Car()
	{
		System.out.println("Car is Automobile");
	}
}

class Locomotive extends Automobile
{
	public void Car()
	{
		super.Car();
		System.out.println("Car is not locomotive");
	}
}


public class Simplain
{
	public static void main(String args[])
	{
		Automobile a=new Automobile();
		Locomotive l=new Locomotive();
		a.Car();
		l.Car();
	}
}
