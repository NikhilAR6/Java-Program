import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pro4 {

	public Set<String> checkName(Set<String> set, String name){
		//Write your logic
		Iterator<String> itr = set.iterator(); 
		boolean flag = false;
		while(itr.hasNext()) {
			if(itr.next().equals(name)) {
				flag = true;
			}
		}
		if(flag == true) {
			set.remove(name);
		}
		else {
			System.out.println("Name is not found");
		}
		return set;
	}
		
		
	
	public static void main(String[] args)
	{
		Set<String> set=new HashSet<String>();
		
		set.add("Shringeri");
		set.add("Koppa");
		set.add("Thirthahalli");
		set.add("smg");
		Pro4 pro=new Pro4();
		String name="Thirthahali";
		Set<String> set1=pro.checkName(set, name);
		System.out.print(set1);
	}
}
