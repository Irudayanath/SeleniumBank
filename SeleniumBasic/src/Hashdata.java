import java.util.Enumeration;
import java.util.Hashtable;


public class Hashdata {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration names;
Hashtable hash=new Hashtable();
hash.put("Jane",12);
hash.put("Char",34);
names=hash.keys();
while(names.hasMoreElements())
{
	String ste=(String) names.nextElement();
	System.out.println(ste);
}
	}

}