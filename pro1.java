import java.util.ArrayList;
import java.util.List;

public class pro1 {
	
	public static void main(String[] args)
	{
	ArrayList<String> al=new ArrayList<String>();
	al.add("Banana");
	
	String s1="Banana";
	String s2="Mango";
	String s3="Orange";
	String s4="Apple";
	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	pro1 pr=new pro1();
	pr.showElements(al);
	
	}
	public void showElements(List<String> list){
		
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			for(String l:list)
			System.out.println(l);
		}
		
	}
}
