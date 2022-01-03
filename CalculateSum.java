
public class CalculateSum {

	int add;
	public int sum(int a,int b, int c)
	{
		this.add=a+b+c;
		return add;
		
	}
	public int sum(int a,int b)
	{
		this.add=a+b;
		return add;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateSum c=new CalculateSum();
		System.out.println("Addition of First 3 no "+c.sum(1,5,6));
		System.out.println("Addition of First 2 no "+c.sum(2,6));
	}

}
