package week1assignment;
public class PrimeNum {

	public static void main(String[] args) {
		int i,count=0,j;
		System.out.println("prime number between 1 to 100");
		for(i=2;i<100;i++) {
			for(j=1;j<=i;j++) {
				if(i%j==0) 
					count++;
				}
			if(count==2)
				System.out.println(" "+i);
			count=0;
			}
	
}

}