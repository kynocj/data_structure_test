package code;


/**
 * 使用队列实现栈
 * @author ainibababpk
 *
 */
public class LinkedListToStack {
	
	class Node {
		Node next;
		Node pre;
		Integer value;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	/**
	 * 先进后出，实现一个双端队列，add数据到tail，remove从tail拿
	 * @author ainibababpk
	 *
	 */
	public class MyStack {
		Node head;
		Node tail;
		
		public Node push(Node node) {
			if (this.head == null) {
				this.head = node;
				this.tail = node;
				return tail;
			}
			
			this.tail.next = node;
			node.pre = tail;
			tail = node;
			return tail;
			
		}
		
		public Node pop() {
			if (head == null) {
				return null;
			}
			if (head == tail) {
				Node node = new Node(head.value);
				head = null;
				tail = null;
				return node;
			}
			
			Node node = new Node(tail.value);
			Node pre = tail.pre;
			tail = pre;
			return node;
			
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListToStack.MyStack myStack = new LinkedListToStack().new MyStack();
		LinkedListToStack.Node node1 = new LinkedListToStack().new Node(1);
		LinkedListToStack.Node node2 = new LinkedListToStack().new Node(2);
		LinkedListToStack.Node node3 = new LinkedListToStack().new Node(3);
		LinkedListToStack.Node node4 = new LinkedListToStack().new Node(4);
		LinkedListToStack.Node node5 = new LinkedListToStack().new Node(5);
		LinkedListToStack.Node node6 = new LinkedListToStack().new Node(6);
		myStack.push(node1);
		myStack.push(node2);
		myStack.push(node3);
		myStack.push(node4);
		myStack.push(node5);
		myStack.push(node6);
		
		System.out.println(myStack.pop().value);
		System.out.println(myStack.pop().value);
		System.out.println(myStack.pop().value);
		System.out.println(myStack.pop().value);
		System.out.println(myStack.pop().value);
		System.out.println(myStack.pop().value);
		
	}

}
