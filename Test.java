
public class Test {

	public static void main(String[] args) {
		try {
			Emp e1 = new Emp(1, "nh", "manager", 1000);
			System.out.println(e1.calculateHRA());
			Emp e2 = new Emp(1, "nh", "clerk", 1000);
			System.out.println(e2.calculateHRA());

		} catch (LowSalException e) {
			System.out.println("Pl give the valid basic amount");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
