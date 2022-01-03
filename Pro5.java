
public class Pro5 {

	public static void main(String[] args)
	{
		String str="I am in Bangalore my house number is 6 and my phone no. 9632133889";
		System.out.println(str);
		test(str);
	}
	public static void test(String str) {
		
		char c[]=str.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isLetter(c[i]))
			{
				letter++;
			}
			else if(Character.isDigit(c[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(c[i]))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("letters "+letter+" num "+num+" space "+space+" other "+other);
		
	}
}
