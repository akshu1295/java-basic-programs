package src;

class ToString {
	String name;
	int no;
	
	public ToString(String name, int no) {
		
		this.name = name;
		this.no = no;
	}
	public String toString() {	//gived hexadecimal representation 
		//return getClass().getName()+"@"+Integer.toHexString(hashCode());
		return no+"  "+name;
	}
	public static void main(String[] args) {
		
		ToString s1=new ToString("AKSHAY",101);
		ToString s2=new ToString("ankita",102);
		//here object reference is getting printed 
		System.out.println(s1);				//src.ToString@5d22bbb7
		System.out.println(s1.toString());	//src.ToString@5d22bbb7
		System.out.println(s2);				//src.ToString@41a4555e
		//any obj other than class object directly returns argument value
		//instead of refernce value
		String a=new String ("akshay");
		System.out.println(a);
	}
	
}
