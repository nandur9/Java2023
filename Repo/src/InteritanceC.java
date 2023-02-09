
public class InteritanceC extends InteritanceA {
	
	  int i;
	
public InteritanceC(int a,int b) {
	
		super.i =a;
		i = b;
	}
	
	void show()
	{
		System.out.println("value of i in obj1:"+super.i );
		System.out.println("value of i in obj2:"+i );
	}

}
