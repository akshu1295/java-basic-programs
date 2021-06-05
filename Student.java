package src;

public class Student extends Person {
		private int roll,fees,grad,marks;
		private String course;
		
		public Student(int roll, int fees, int grad, int marks, String course) {
			//super(f_n,l_n);
			this.roll = roll;
			this.fees = fees;
			this.grad = grad;
			this.marks = marks;
			this.course = course;
			
		}
//		public String getDeatils(String f_n,String l_n,int roll, int fees, int grad, int marks, String course) {
//			return f_n+" "+l_n+" "+"roll: "+roll+" fees: "+fees+" graduation year "+grad+" marks "+marks+" course "+course;
//		}
		
		public String toString() {
			return "roll: "+roll+" fees: "+fees+" graduation year "+grad+" marks "+marks+" course "+course;

		}
		
}
