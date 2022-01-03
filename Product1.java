
public class Product1 {

	
		String id;
		String name;
		float price;
		
		public Product1(String id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		
		public void swap(Product1 desktop) {
			float pri = desktop.price;
			desktop.price = this.price;
			this.price = pri;
		}
	
		public static void main(String[] args) {
			Product1 laptop = new Product1("1", "DELL", 10000);
			Product1 desktop = new Product1("2", "lg", 20000);
			System.out.println("laptop  "+laptop.price);
			System.out.println("desktop  "+desktop.price);
			
			laptop.swap(desktop);
			
			System.out.println("laptop  "+laptop.price);
			System.out.println("desktop  "+desktop.price);
		}
		
		
	}
