package week3.Day1;

public class Auto extends VehicleInheritance {
public void meterisOn() {
	System.out.println("Auto Metered");
}
public void handStarted() {
	System.out.println("Auto is Hand Started");
	//applyBrakes();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//handStarted();
		Auto o2=new Auto();
		o2.applyBrakes();
		o2.handStarted();
		o2.meterisOn();

	}

}
