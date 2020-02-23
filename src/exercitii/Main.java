package exercitii;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack l = new MyStack();
		l.peek();
		l.pop();
		
		MyQueue q = new MyQueue();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(6);
		q.peek();
		q.poll();
		q.peek();
		
		
	}

}
