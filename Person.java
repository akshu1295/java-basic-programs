package src;

public class Person {
	private String f_n,l_n;

	public Person(String f_n, String l_n) {
		
		this.f_n = f_n;
		this.l_n = l_n;
	}
	public Person() {
		System.out.println("please enter first name and last name");
	}
	
	public String getDetails() {
		return f_n+" "+l_n;
	}
}
