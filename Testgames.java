
public class Testgames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game[] g=new Game[10];
		
		for(int i=0;i<=10-1;i++)
		{
			int no= (int) ((Math.random()*100)%3)+1;
			
			if(no==1)
			{
				g[i]=new Car();
			}
			else if(no==2)
			{
				g[i]=new Bike();
			}
			else
			{
				g[i]=new Bicycle();
			}
		}
		for(int i=0;i<10;i++)
		{
			g[i].start();
			g[i].play();
			g[i].stop();
			System.out.println();
		}
		
	}

}
