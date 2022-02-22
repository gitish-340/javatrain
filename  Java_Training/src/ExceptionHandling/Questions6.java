package ExceptionHandling;
	
	
	import java.util.InputMismatchException;
	import java.util.Scanner;



	class NegativeValue extends Exception
	{
		public NegativeValue(String msg)
		{
			super(msg);
		}
	}

	class ValueOutOfRange extends Exception
	{
		public ValueOutOfRange(String msg)
		{
			super(msg);
		}
	}

	public class Questions6 {
		
		public void original() throws NegativeValue
		{     Scanner s=new Scanner(System.in);
			 int arr[]=new int[20];
			 int sum=0;
			 float avg;
			try {
			for(int i=1;i<4;i++)
			{
			 System.out.println("enter marks of subject "+i);
			 arr[i]=s.nextInt();
			  sum = sum + arr[i];
			  if(arr[i]<0) {
					  throw new NegativeValue("negative");
		     }
			  else if(arr[i]>100)
			  {
				  ValueOutOfRange v=new ValueOutOfRange("out");
				  throw v;
			  }
			 
			}
			
			  System.out.println("Sum:"+sum);
		        avg = (float)sum / 3;
		        System.out.println("Average:"+avg);
			
		}
			catch(InputMismatchException e)
			{
				System.out.println(e);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			} catch (ValueOutOfRange e) {
			
				e.printStackTrace();
			}
		}
		

		public static void main(String[] args) {
			System.out.println("enter name:");
			Scanner sc=new Scanner(System.in);
			String name=sc.nextLine();
			Questions6 obj=new Questions6();
			try {
				obj.original();
			} catch (NegativeValue e) {
				
				e.printStackTrace();
			}
			System.out.println("enter name of second student");
			String name1=sc.nextLine();
			Questions6 obj1=new Questions6();
			try {
				obj1.original();
			} catch (NegativeValue e) {
				
				e.printStackTrace();
			}

		}

	}
