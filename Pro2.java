import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Pro2 {

	public String[] getResults(String names[]){
		//Write your logic
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<names.length;i++)
		{
			al.add(names[i]);
		}
		Collections.sort(al);
		
//		System.out.println(al);
	    String[] str=al.toArray(new String[0]);
	    String[] res=new String[str.length];
	    int k=0;
	    
	    for(int j=0;j<str.length;j++)
	    {
	    	if(j<str.length/2)
	    	{
	    		res[k++]=str[j].toLowerCase();
	    	}
	    	else
	    	{
	    		res[k++]=str[j].toUpperCase();
	    	}
//	    	return str;
	    }
	    return res;
	    
		}
	
	public static void main(String[] args)
	{
		Pro2 pr=new Pro2();
		String [] str= {"n","a","f","b"};
		String[] res=pr.getResults(str);
		
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]);
		}
	}
}
