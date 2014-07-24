package SingeltonPattern;

public class Singelobject {

	private static Singelobject key=new Singelobject();
	private Singelobject()
	{
		
	}
	public static Singelobject getInstance()
	{
		return key;
	}
	 void show()
	{
		System.out.println("Network Key is Created Using Singelton");
	}
}
