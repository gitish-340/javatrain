package abstractandinterface;
abstract class RBI{
	RBI(int a){
	System.out.println("RBI");	
	}
}
public class AbstractDemo2  extends RBI{

	AbstractDemo2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI r = new AbstractDemo2(10);

	}

}
