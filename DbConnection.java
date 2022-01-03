
public class DbConnection {

	private  static DbConnection obj=null;
	
	private DbConnection() {
		
		
	}
	public static DbConnection getObject()
	{
		if(obj==null)
		{
			obj=new DbConnection();
			System.out.println("Object created");
		}
		else
		{
			System.out.println("Object Not created");
			throw new IllegalArgumentException("Object alredy created");
		}
		return obj;
	}
	public static void main(String args[])
	{
		DbConnection.getObject();
		DbConnection.getObject();

		
		
	}
	
}
