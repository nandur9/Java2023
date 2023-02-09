
public class FinalDemo {
	
	final int maxAge =100;
	private Object obj;
	
	public void setAge()
	{
		int Age = 110;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InteritanceA obj1 = new InteritanceA();
		InteritanceB obj2 = new InteritanceB();
		obj1.i =10;
		obj1.j =20;
		obj1.showij();	
		
		obj2.k=30;obj2.i =40;obj2.j =50;
		obj2.k=30;
		obj2.i=40;
		obj2.j=50;
		obj2.showij();
		obj2.showk();
		
	}
	

}
