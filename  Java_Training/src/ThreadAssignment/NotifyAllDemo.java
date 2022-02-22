package ThreadAssignment;
class A extends Thread   
{  
    public void run()  
    {  
        synchronized(this)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            try {  
                this.wait();  
            }  
            catch (InterruptedException e) {  
                e.printStackTrace();}  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}  
class B extends Thread {  
    A a;  
    B(A a)  
    {  
        this.a = a;  
    }  
    public void run()  
    {  
        synchronized(this.a)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            try {  
                this.a.wait();  
            }  
            catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}   
class C extends Thread   
{  
    A a;  
    C(A a)  
    {  
        this.a = a;  
    }  
    public void run()  
    {  
        synchronized(this.a)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            // call the notifyAll() method  
            this.a.notifyAll();  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}  
public class NotifyAllDemo  
{  
    public static void main(String[] args) throws InterruptedException  
    {  
        A a = new A();  
        B b = new B(a);  
        C c = new C(a);  
          
        // creating the threads   
        Thread t1 = new Thread(a, "Thread-1");  
        Thread t2 = new Thread(b, "Thread-2");  
        Thread t3 = new Thread(c, "Thread-3");  
          
        // call run() method  
        t1.start();  
        t2.start();  
        //Thread.sleep(100);  
        t3.start();  
    }  
} 