
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//normal method invocation
		Phone p=new Phone();
		p.call();
		p.sms();
		SmartPhone sp=new SmartPhone();// sp will allow all calling of all methods 
		sp.click();
		sp.record();
		sp.delete();
		sp.surf();
		sp.play();
		sp.pause();
		
		Musicplayer mp=new SmartPhone();
		//parent musicplayer ref will allow calling only its methods using smartphone object 
				mp.pause();
				mp.play();
		//mp.surf(); //will not allow calling other methods outside that class so error 
		
		Browser b=new SmartPhone();//will alow calling of browser methods only 
		b.delete();
		b.surf();
				
		Camera cc=new SmartPhone();//will allow calling of camera methods only
		cc.click();
		cc.record();
	}

}

class Phone{
	public void call() {
		System.out.println("normal class method phone call function");
	}
	public void sms() {
		System.out.println("sms function normal method ");
	}
}

interface Musicplayer{
	void play();
	void pause();
}

interface Camera{
	void click();
	void record();
}

 abstract class Browser{
	public void surf() {
		System.out.println("non abstract method in abstract class");
		
	}
	public abstract void  delete();
}
 
class SmartPhone extends Browser implements Musicplayer,Camera{
	public void click() {
		System.out.println("clcik method overrriden");
	}
	public void record() {
		System.out.println("record method overidden");
	}
	public void play() {
		System.out.println("play method overridden");
	}
	public void pause() {
		System.out.println("pause method overrriden");
	}
	
	public void delete() {
		System.out.println("abstractmethod delete overridden");
	}
}