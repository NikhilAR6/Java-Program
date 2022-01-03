public class Pro4 {

	public static void main(String args[])
	{
		String s ="miani,lakshman,java,malli,narayana";
		String searchString ="narayana";//"java";
		
		String str[]=s.split(",");
		for(int i=0;i<=str.length-1;i++)
		{
			if(str[i].equals(searchString))
			{
				System.out.println("search String found in "+(i+1)+" position");
			}
		}
	}
}
