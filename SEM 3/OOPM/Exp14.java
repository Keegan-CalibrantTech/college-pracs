class Sum implements Runnable{
	public void run() {
		int s=0;
		for (int i=1;i<=5;i++) {
			s=s+i;
		}
		System.out.println("T1 : The sum is  "+s);
	}
}

class Factorial implements Runnable{
	public void run() {
		int s=1;
		for (int i=1;i<=5;i++) {
			s=s*i;
		}
		System.out.println("T2 : The factorial is "+s);
	}
}
public class Exp14 {

	public static void main(String[] args) {
		Sum s = new Sum();
		Thread t1 = new Thread(s);
		Factorial f = new Factorial();
		Thread t2 = new Thread(f);
		
		t1.start();
		t2.start();

	}

}