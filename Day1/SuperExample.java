package Day1;

public class SuperExample {
	static int a;
	int b;
	
public static void main(String[] args) {
	
	//System.out.println("main starts");

	SuperExample se=new SuperExample();
	System.out.println(se.b);
	System.out.println("main ends");
	System.out.println("main starts");
	//System.out.println(se.b);
	
		// TODO Auto-generated method stub

	}
{
System.out.println("inside non static methods");

} 

static
{
	System.out.println("static blocks");
}

}