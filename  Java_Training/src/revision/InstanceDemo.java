package revision;

class InstanceDemo {
	int i;//instance variable
	public static void main(String[] args) {
		int b =34;// local variable 
		InstanceDemo ins = new InstanceDemo();
		System.out.println(ins.i);
		ins.methodOne();
		System.out.println(b);
	}
	public void methodOne() {
		System.out.println("hello"+i);
		int c=3;
		System.out.println(+c);
	}

}
