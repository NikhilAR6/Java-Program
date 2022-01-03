
public class Member implements Comparable<String>{

	String mid, name, city, country;

	public Member(String mid, String name, String city, String country) {
		super();
		this.mid = mid;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	
	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
	public void display()
	{
		System.out.println("mid=" + mid + ", name=" + name + ", city=" + city + ", country=" + country);
	}


	@Override
	public int compareTo(String arg0) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(arg0);
	}
	
	
}
