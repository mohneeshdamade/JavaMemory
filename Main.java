/**
 * Predict the output of this code, by analyzing the memory changes in stack and heap
 * @author Mohneesh
 *
 */

public class Main {

	public static void main(String args[]) {
		Main main = new Main();
		main.start();
	}
	
	public void start() {
		String last = "Z";
		Container container = new Container();
		container.setInitial("C");
		another(container,last);
		System.out.print(container.getInitial());
	}
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B");
		Container initial2 = new Container();
		initialHolder=initial2;
		System.out.print(initialHolder.getInitial());
		System.out.print(newInitial);
	}
}
