public class LinkNode<T> {
	int size = 0;
	private Node<T> head = new Node<T>();
	
	public void add(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		if (size > 0) {node.next = head.next;}
		head.next = node;
		size++;
	}
 	
	//链表反转
	public void exchange() {
		if(size == 0) return;
		Node<T> currentNode = head.next.next;
		Node<T> previousNode = head.next;
		for (int i = 0; i < size-1; i++) {
			if(i == size-2) {
				previousNode.next = null;
				currentNode.next = head.next;
				head.next = currentNode;
				return;
			}
			previousNode.next = currentNode.next;
			currentNode.next = head.next;
			head.next = currentNode;
			currentNode = previousNode.next;
		}
	}
	
	//测试
	public static void main(String[] args) {
		LinkNode<Integer> linkNode = new LinkNode<>();
		linkNode.add(1);
		linkNode.add(2);
		linkNode.add(3);
		linkNode.add(4);
		linkNode.add(5);
		Node node = linkNode.head.next;
		for (int i = 0; i < linkNode.size; i++) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println();
		linkNode.exchange();
		node = linkNode.head.next;
		for (int i = 0; i < linkNode.size; i++) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}

//简单链表
class Node <T>{
	T data;
	Node<T> next;
	
	public Node() {}
	
	public Node(T data) {
		super();
		this.data = data;
	}
}

