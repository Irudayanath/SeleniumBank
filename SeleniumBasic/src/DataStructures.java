import java.util.Stack;


public class DataStructures {

	
	private static void showstack(Stack stack,int a)
	{
stack.push(new Integer(a));	
	}
	public static void main(String[] args) {
Stack stack=new Stack();
showstack(stack,4);
showstack(stack,9);
showstack(stack,10);
}

}
