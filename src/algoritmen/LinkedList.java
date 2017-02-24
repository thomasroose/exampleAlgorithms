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
	 * Constructor for a linked list with one element
	 * 
	 * @param element
	 */
	public LinkedList(T element){
		head = new Node(element);
		size = 1;
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
		return head.get();
	}
	
	/**
	 * 
	 * @return the number of element in the linked list
	 */
	public int size(){
		return size;
	}
	
	/**
	 * 
	 * @return true is empty, false is not empty
	 */
	public boolean isEmpty(){
		return size == 0;
	}
	
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
	}
}
