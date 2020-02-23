package exercitii;
import java.util.LinkedList;
import java.util.List;
public class MyStack {
	private List <Integer> l = new LinkedList <>();
	
	public void push(int e) {
		l.add(e);
	}
	
	public void pop() {
		if (l.isEmpty()) {
			System.out.println("Stiva este goala.");
		} else {
			l.remove(0);
		}
		
	}
	
	public void peek() {
		if (l.isEmpty()) {
			System.out.println("Stiva este goala.");
		} else {
			System.out.println(l.get(0));
		}
		
	}
}
