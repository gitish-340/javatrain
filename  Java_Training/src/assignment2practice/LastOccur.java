package assignment2practice;
import java.util.*;
public class LastOccur {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				String target = "Hello I am gitish Arora";
				String p = "";
				int num = 0;
				StringTokenizer token = new StringTokenizer(target," ");
				while(token.hasMoreTokens()) {
					p = token.nextToken();
					if(p.endsWith("m")||p.endsWith("M")||p.endsWith("n")||p.endsWith("N")) {
						num++;
					}
				}
				System.out.println(num+" words end with m or n");
				
			}

		}
