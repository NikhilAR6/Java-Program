import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class MemeberContainer {

	List<Member> list=new ArrayList<Member>();
	
	
	
	public void addMemeber (String name, String city, String country){
		
		String mid=MemberIdGenerator.getMemeberId();
		Member m=new Member(mid, name, city, country);
		list.add(m);
		
	}
	
	public void displayList()
	{
		System.out.println(list);
	}
	
	public void deleteMember(String id)
	{
		for(Member me:list)
		{
			if(me.equals(id))
			{
				list.remove(me);
				System.out.println("Deleted successfully");
				return;
			}
		}
		System.out.println("No member Found");
	}
	
	public void searchById(String id)
	{
		for(Member me:list)
		{
			if(me.equals(id))
			{
				me.display();
				return;
				
			}
		}
		System.out.println("No member Found");
	}
	
	public void searchMember(String id,String name)
	{
		for(Member me:list)
		{
			if(me.getMid().equals(id) || me.getName().equals(name))
			{
				me.display();
				return;
			}
		}
		System.out.println("No member Found");
	}
	
	public void displaySortingOrder(String s) 
	{
		Comparator<Member> c1 = (s1 , s2) -> s2.getName().compareTo(s1.getName());
		Comparator<Member> c2 = (s1 , s2) -> s1.getName().compareTo(s2.getName());
		if(s.equalsIgnoreCase("Desen"))
		{
			Collections.sort(list, c1);
			System.out.println(list);
		}
		else
		{
			if(s.equalsIgnoreCase("Asen"))
			{
				Collections.sort(list , c2);
				System.out.println(list);
			}
		}
	}
	
}
