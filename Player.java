import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Player {

	String name,email,city,state;
	int age;
	
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, String email, String city, String state, int age) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.state = state;
		this.age = age;
	}

	public void getPlayers(List<Player> football, List<Player> cricket)//List<String>
		{
		    Set<Player> set=new TreeSet<Player>();
		    List<Player> list=new ArrayList<Player>();
		    List<Player> res=new ArrayList<Player>();
		    
		    list.addAll(football);
		    list.addAll(cricket);
			System.out.println(list);
		
//			football.retainAll(cricket);
			
			for(Player x:list)
			{
				if(set.add(x))
				{
					return;
//					System.out.println();
				}
				else
				{
					res.add(x);
				}
			}
			System.out.println("result ="+res);
		
		}
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", email=" + email + ", city=" + city + ", state=" + state + ", age=" + age
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		List<Player> listc=new ArrayList<Player>();
		List<Player> listf=new ArrayList<Player>();
		
		Player p1=new Player();
		Player p=new Player("Bharath","Bharath@gmail.com", "tth", "karnataka", 20);
		Player p2=new Player("Raju","raju@gmail.com", "tth", "karnataka", 20);
		Player p4=new Player("Vikki","vikki@gmail.com", "tth", "karnataka", 20);
		Player p3=new Player("Raju","raju@gmail.com", "tth", "karnataka", 20);
		
		listc.add(p);
		listc.add(p2);
		listf.add(p3);
		listf.add(p4);
		
		p.getPlayers(listc, listf);
	
	}

}
