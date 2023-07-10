package Day1;

public class Super {
	
public 	Super()
	{
		System.out.println(" parent class");
		
	}
	
	class  Super2 extends Super {
		
		public Super2()
		{
		super();
		System.out.println(" child class");
		
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Super2 sup=new Super2();

	}

}
