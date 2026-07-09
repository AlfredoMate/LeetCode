import java.util.ArrayDeque;

class Main {
	
	public static void main(String[] args) {

		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		int k = 3;
		ReverseElements reverseElements = new ReverseElements();
		System.out.println("Original queue: " + queue + "\nk: " + k);
		System.out.println("Reversed queue: " + reverseElements.reverseQueue(queue, k));
	}
}
