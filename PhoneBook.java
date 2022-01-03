import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

	public static Map<String,String> map=new HashMap<String,String>();
	
	public  void addDetails(String phno,String name)
	{
		map.put(phno, name);
	}
	
	public String getName(String phn){
		System.out.println(phn);
		if(map.containsKey(phn) == true) {
			return map.get(phn);
		}

		return "contact not found ";
	}
	
}
