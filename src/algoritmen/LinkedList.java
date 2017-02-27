package algoritmen;

/**
 * 
 * @author thomas
 * 
 * Singly linked list
 *
 * @param <T> type of the parameter
 */
public class LinkedList<T> {
	private Node head;
	private int size;
	
	/**
	 * Constructor of an empty list
	 */
	public LinkedList(){
		head = null;
		size = 0;
	}
	
	/**
	 * Constructor for a linked list with one element
	 * 
	 * @param element
	 */
	public LinkedList(T element){
		head = new Node(element);
		size = 1;
	}
	
	private LinkedList(Node node){
		head = node;
		size = count(node,0);
	}
	
	/**
	 * 
	 * Prepend the element to the linkedlist
	 * 
	 * @param element
	 */
	public void prepend(T element){
		Node newNode = new Node(element, head);
		head = newNode;	
		size++;
	}
	
	/**
	 * 
	 * @return the head of the list
	 */
	public T first(){
		if(head == null) return null;
		return head.get();
	}
	
	/**
	 * 
	 * @return the last element of the list
	 */
	public T last(){
		return lastRecursive(head).get();
	}
	
	private Node lastRecursive(Node current){
		if(current.next() == null) return current;
		return lastRecursive(current.next());
	}
	
	/**
	 * 
	 * @return the number of elements in the linked list
	 */
	public int size(){
		return size;
	}
	
	/**
	 * 
	 * @return the linked list without the head element
	 */
	public LinkedList<T> tail(){
		return new LinkedList<T>(head.next());
	}
	
	/**
	 * 
	 * @return true is empty, false is not empty
	 */
	public boolean isEmpty(){
		return size == 0;
	}
	
	/**
	 * Find the element in the list
	 * @param element to find
	 * @return true if element is present in the list otherwise false
	 */
	public boolean find(T element){
		Node cursor = head;
		do{
			if(cursor.get().equals(element)) return true;
		}
		while(cursor.next() != null);
		return false;
	}
	
	private int count(Node current, int total){
		if(current == null)return total;
		return count(current.next(), ++total);
	}
	
	
	/*public T last(){
		return lastRecursive(head).get();
	}
	
	private Node lastRecursive(Node current){
		if(current.next() == null) return current;
		return lastRecursive(current.next());
	}*/
	
	private class Node{
		private T element;
		private Node next;
		
		//constructor overloading
		public Node(T element){
			this(element, null);
		}
		
		public Node(T element, Node next){
			this.element = element;
			this.next = next;
		}
		
		public T get(){
			return element;
		}
		
		public Node next(){
			return next;
		}
	}
}
