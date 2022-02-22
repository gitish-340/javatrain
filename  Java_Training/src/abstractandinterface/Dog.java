package abstractandinterface;

class Animal {
//	public Animal(){
//		System.out.println("this is constructor");  // this is called due to super called in  every constructor by default
//	}
	int a ;
	public Animal(int a) {
		this.a = a;
		System.out.println("this is animal constructor"+a);
	}
	public void run() {
		System.out.println("animal is running");
	}
}

class Dog extends Animal {
	public Dog(int x, int y) {
		super(30);// due to the super keyword immediate parent class parameterised constructor called
		System.out.println(x+ "this is Dog Constructor" +y);
	}
//	Dog(){
//		System.out.println("hello dog");
//	}
	public void run() {
		super.run();  // due to the super keyword immediate parent class method is called 
		System.out.println("dog is running1");
	}

	public static void main(String[] args) {
		Dog d = new Dog(10,30);
		d.run();

	}

}
