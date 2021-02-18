import java.util.*;
public class Students implements IMath 
{
	
	@Override
	public void add() 
	{
		
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter any two integer values to perform addition");

	    int a=sc.nextInt();

	    int b=sc.nextInt();

	    int s=a+b;

	    System.out.println("Sum of "+a+" and "+b+" is "+s);
	    
	}

	@Override
	public void sub() 
	{
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter any two integer values to perform subtraction");

	    int a=sc.nextInt();

	    int b=sc.nextInt();

	    int s=a-b;

	    System.out.println("Sum of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void mul() 
	{
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter any two integer values to perform multiplication");

	    int a=sc.nextInt();

	    int b=sc.nextInt();

	    int s=a*b;

	    System.out.println("mul of "+a+" and "+b+" is "+s);

	}

	@Override
	public void div() {
		
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter any two integer values to perform division");

	    int a=sc.nextInt();

	    int b=sc.nextInt();

	    int s=a/b;

	    System.out.println("div of "+a+" and "+b+" is "+s);
	    sc.close();
	}

	public static void main(String[] args) {
		Students st=new Students();
		st.add();
		st.sub();
		st.mul();
		st.div();
		
		
	}

}
