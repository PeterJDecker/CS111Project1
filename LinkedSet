/**
 * Stores the elements in a linear searched, linked chain of nodes.
 * @author Peter Decker
 */
public class LinkedSet implements Set{
	/**
	 * Node subclass made up of a node with a single direction pointer and value in int.
	 */
	class Node {
		int value;
		Node next;
	}
	
	public Node head;
	public int size;
	
	public LinkedSet() {
		head = null;
		size = 0;
	}
	
	@Override
	public boolean add(int element) {//Appends to front of the Node chain.
		if(contains(element))
			return false;
		
		Node make = new Node();
		make.value = element;
		make.next = head;
		head = make;
		size++;
		return true;
	}

	@Override
	public boolean remove(int element) {
		if(!contains(element))
			return false;
		
		Node helper = new Node();
		helper.next = head;
		Node iterator = helper;
		
		while(iterator.next != null) {
			if(iterator.next.value == element) {
				Node removed = iterator.next;
				iterator.next = removed.next;//Removes the node denoted removed here.
			}
			else {
				iterator = iterator.next;
			}
		}
		size--;
		return true;
	}

	@Override
	public boolean contains(int element) {
		Node iterator = head;
		for(int i = 0; i < this.size; i++) {//linear search of Node chain
			if(iterator.value == element) {
				return true;
			}
			iterator = iterator.next;
		}
		
		return false;
	}

	@Override
	public int size() {
		return size;
	}

}
