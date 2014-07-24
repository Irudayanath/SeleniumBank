import java.util.Vector;


public class Enumeration {

	
	public static void main(String[] args) {
java.util.Enumeration e;
Vector v=new Vector();
v.add("welome");
v.add("new");
v.add("Jack");
e= v.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}

	}

}
