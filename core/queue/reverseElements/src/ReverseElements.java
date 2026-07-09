import java.util.ArrayDeque;

class ReverseElements {
	
	public ArrayDeque<Integer> reverseQueue (ArrayDeque<Integer> queueToReverse, int k) {
		
		ArrayDeque<Integer> tempStack = new ArrayDeque<>();
		
		for (int i = 0; i < k; i++) {
			tempStack.push(queueToReverse.poll());
		}

		while (tempStack.size() > 0) {
			queueToReverse.add(tempStack.pop());
		}

		int rotations = queueToReverse.size() - k;

		for (int i = 0; i < rotations; i++) {
			queueToReverse.add(queueToReverse.poll());
		}

		return queueToReverse;

	}	
}
