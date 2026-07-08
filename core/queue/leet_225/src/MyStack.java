import java.util.ArrayDeque;

class MyStack{

	private ArrayDeque<Integer> list;

	public MyStack() {
		list = new ArrayDeque<>();
	}

	public void push(int x) {
		list.addLast(x);
		for (int i = 0; i < list.size() - 1; i++) {
			int current = list.poll();
			list.addLast(current);	
		}
		
	}

	public int pop(){

		return list.poll();
	}

	public int top () {
		return list.peek();
	}

	public boolean empty() {
		return list.size() == 0 ? true : false;
	}
}
