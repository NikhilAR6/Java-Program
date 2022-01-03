
public class Product {

	String pid, pname;
	int price;

	public Product(String pid, String pname, int price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	private void diplay() {
		System.out.print("Product Id = "+pid + "  " + " Product Name = "+pname + " Price "+ price);  
		System.out.println();  
	}
	
	public static void main(String[] args) {
		Product[] obj = new Product[10];
		obj[0] = new Product("11","Dell Laptop", 35000);  
		obj[1] = new Product("12","HP Laptop", 3022);  
		obj[2] = new Product("13","Lenovo Laptop",20000);  
		obj[3] = new Product("14","MI TV",25000);  
		obj[4] = new Product("15","Kingston USB", 100000);  
		obj[5] = new Product("16", "sony TV", 40000);
		obj[6] = new Product("17","LG  TV",70000);  
		obj[7] = new Product("18","MI Pro Max 9",40000);  
		obj[8] = new Product("19","1+ TV ", 9000);  
		obj[9] = new Product("20", "BPL TV", 30000);
		
		for(int i = 0; i<obj.length; i++) {
			obj[i].diplay();
		}
	}

}
