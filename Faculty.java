package src;

public class Faculty extends Person {
	private int exp;
	private String subject;

	public Faculty(String f_n,String l_n,int exp,String subject) {
		super(f_n,l_n);
		this.subject=subject;
		this.exp=exp;
		
	}
}
