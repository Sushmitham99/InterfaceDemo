import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> s=new Stack<String>();
s.push("Java");
s.push("C++");
s.push("C#");
s.push("python");
System.out.println(s);

//s.pop();

//s.search("C++");


Iterator<String> itr=s.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
	
}
	System.out.println("Peek:"+s.peek());
	System.out.println("Search:"+s.search("C++"));
	System.out.println("Empty:"+s.isEmpty());
	System.out.println("Pop:"+s.pop());
	//System.out.println("Push:"+s.push());
	
	


}
}
