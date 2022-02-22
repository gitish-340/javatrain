package java8features;
//interface Drawable{  
//    public void draw();  
//}  
//public class LambdaDemo {  
//    public static void main(String[] args) {  
//        int width=10;  
//  
//        //without lambda, Drawable implementation using anonymous class  
//        Drawable d=new Drawable(){  
//            public void draw(){System.out.println("Drawing "+width);}  
//        };  
//        d.draw();  
//    }  
//}  
//@FunctionalInterface  //It is optional  
//interface Drawable{  
//    public void draw();  
//}  
//  
//public class LambdaDemo {  
//    public static void main(String[] args) {  
//        int width=10;  
//          
//        //with lambda  
//        Drawable d2=()->{  
//            System.out.println("Drawing "+width);  
//        };  
//        d2.draw();  
//    }  
//} 
//interface Sayable{  
//    public String say();  
//}  
//public class LambdaDemo  {
//public static void main(String[] args) {  
//    Sayable s=()->{  
//        return "I have nothing to say.";  
//    };  
//    System.out.println(s.say());  
//}  
//}  
//interface Bicycle{
//	void speed();
//}
//class LambdaDemo{
//	public static void main(String [] args) {
//		Bicycle b= ()->{
//			System.out.println("bicycle speed is awesome");
//		};
//		b.speed();
//	}
//	}

//interface Cycle{
//	void speed(int s);
//}
//class LambdaDemo{
//	public static void main(String[] args) {
//		Cycle c = (s)->{
//			System.out.println( "Hello I am using bicycle");
//		};
//		c.speed(45);
//	}
//}
//interface Cycle{
//int show(int a ,int b);
//}
//class LambdaDemo{
//public static void main(String[] args) {
//	Cycle c = (a,b)->(a+b);
//	System.out.println(c.show(10,34));
//	Cycle c3 = (a,b)->(a-b);
//	System.out.println(c3.show(45, 3));
//	Cycle c2 = (a,b)->(a*b);
//	System.out.println(c2.show(3, 3));
//	Cycle c1= (a,b)->(a/b);
//	System.out.println(c1.show(45,15));}
//}

//import java.util.*;  
//public class LambdaDemo{  
//    public static void main(String[] args) {  
//          
//        List<String> list=new ArrayList<String>();  
//        list.add("ankit");  
//        list.add("mayank");  
//        list.add("irfan");  
//        list.add("jai");  
//          
//        list.forEach(  
//            (n)->System.out.println(n)  
//        );  
//    }  
//}  


//interface Sayable{
//	String say(String Message);
//	}
//public class LambdaDemo{
//	public static void main(String[] args) {
//		Sayable s= (message)->{
//			String str1="I would like to say,";
//			String str2=str1+message;
//			return str2;
//			};
//			System.out.println(s.say("Time is precious"));
//	}
//}



public class LambdaDemo
{
	public static void main(String[] args) {
		Runnable r = new Runnable(){
			public void run() {
				System.out.println("Thread is running");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
	}
}
