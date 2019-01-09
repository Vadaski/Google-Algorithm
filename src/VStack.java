
public class VStack<T> {
	
	Node<T> head = new Node<T>();
	
	public boolean isEmpty() {
		return head.next == null;
	}
	
	public void push(T item) {
		Node<T> node = new Node<T>(item);
		if (isEmpty()) {
			head.next = node;
			return;
		}
		node.next = head.next;
		head.next = node;
	}
	
	public T pop() {
		if (isEmpty()) {
			return null;
		}
		T data = head.next.data;
		head.next = head.next.next;
		return data;
	}
}



