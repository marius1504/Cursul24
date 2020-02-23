 package exercitii;

public class MyQueue {
	private int head;
	private int tail;
	private int size;
	private int [] value = new int[4];
	
	public void offer (int e) {
		if (size == value.length) {
			value = resize(value);
		}
		value[tail] = e;
		tail = (tail + 1) % value.length;
		size++;
		
	}
	
	public void poll() {
		int ret = value[head];
		head = (head + 1) % value.length;
		System.out.println(ret); 
	}
	
	public void peek() {
		System.out.println(value[head]);
	}
	
	private int [] resize(int[] value) {
		int [] temp = new int [value.length * 2];
		int i = 0;
		while (size > 0) {
			temp[i] = value[head];
			size--;
			i++;
			head = (head + 1) % value.length;
		}
		head = 0;
		tail = value.length;
		size = value.length;
		value = temp;
		return value;
	}
}
