package ExceptionHandling;
interface i2{
void show();	
}
interface i3{
	void show1();
}
interface i4 extends i2,i3{
	void show2();
}

public class InterfaceDemo1 implements i4 {

	public static void main(String[] args) {
		i4 i1= new InterfaceDemo1();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}

}
