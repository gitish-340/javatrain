package assignment2practice;
//Write a Java program to print after removing duplicates from a given string. 
public class Removal {

	public static void main(String[] args) {
		String s = "Welcome To Welcome";
		int last_index = -1;
		String[] s_splitted = s.split(" ");
		for(String temp : s_splitted){
			if(s.indexOf(temp) != s.lastIndexOf(temp)){
				last_index = s.lastIndexOf(temp);
			}
		}
		
		char[] updated_s = new char[s.length()];
		for(int i = 0;i < last_index; i++){
			updated_s[i] = s.charAt(i);
		}
		for(char c : updated_s){
			System.out.print(c);
		}

	}

}
