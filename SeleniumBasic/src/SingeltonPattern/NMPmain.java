package SingeltonPattern;

public class NMPmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//Singelobject s=new Singelobject();
Singelobject s=Singelobject.getInstance();
s.show();

	}

}
