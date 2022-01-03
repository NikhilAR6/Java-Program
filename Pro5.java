import java.util.HashMap;
import java.util.Map;

public class Pro5 {
	
	public void viewElements(Map<Integer, String> map){
		//Write your logic
		System.out.println(map.entrySet());
		
		}

	 public static void main(String args[])
	    {
	      Map<Integer,String> map=new HashMap<Integer,String>();
	      map.put(1001, "Manoj");
	      map.put(1002,"Krish");
	      
	      Pro5 p=new Pro5();
	      p.viewElements(map);
	    }
}
