package methodrefrences;

public class ConMain {

	public static void main(String[] args) {
		Provider provider =Student::new;
		Student s = provider.getStudent();
		s.display();
	}
	
}
