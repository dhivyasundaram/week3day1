package week3day1assign;

public class Axisbank extends Bankinfo{
	public void deposit() {
		System.out.println("overriding the method deposits() in Axisbank");
	
		
	}
public static void main(String[] args) {
	Axisbank a = new Axisbank();
	a.saving();
	a.fixed();
	a.deposit();
	
}
}
