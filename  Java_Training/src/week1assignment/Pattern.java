package week1assignment;

public class Pattern {
	public static void main(String[] args) {
		int n=15;
        int i,j;
        for( i=1;i<=n;i++){
            for( j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
	}

}
