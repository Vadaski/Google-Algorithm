
public class VQueue<T> {
	int size;
	int currentSize = 0;
	Node<T> head;
	Node<T> tail;
	public VQueue(int size) {
		this.size = size;
		head = new Node<T>();
		Node<T> current = head;
		for (int i = 0; i < size-1; i++) {
			current.next = new Node<T>();
			current = current.next;
		}
		current.next = head;
		this.tail = head;
	}
	
	public boolean enqueue(T item) {
		if(currentSize == size) return false;
		tail.data = item;
		tail = tail.next;
		currentSize++;
		return true;
	}
	
	public T dequeue() {
		if(currentSize == 0) return null;
		T item = head.data;
		head.data = null;
		head = head.next;
		currentSize--;
		return item;
	}
	
	public static void main(String[] args) {
		VQueue<Integer> queue = new VQueue<Integer>(5);
		for (int i = 0; i < 3; i++) {
			System.out.println(queue.enqueue(i));
		}	for (int i = 0; i < 2; i++) {
			System.out.println(queue.dequeue());
		}
	}
}
