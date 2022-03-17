/**
 * A self-organizing heuristic by overriding just the query for containment 
 * so that if the element is contained then it is swapped with the front element.
 * @author Peter Decker
 */
public class HeuristicSet extends LinkedSet
{	
	public boolean contains(int element) {
		Node iterator = super.head, originalHead = super.head, theOne;
		
		if(iterator == null) {
			return false;
		}
		if(iterator.value == element) {//if the head is the element we are looking for there is no need to look further
			return true;
		}
		
		while(iterator.next != null) {//linear search of Node chain
			if(iterator.next.value == element) {//Swaps values
				theOne = iterator.next;
				
				super.head.next = theOne.next;//The previous head now points to the node after the desginated node like the next node did.
				theOne.next = originalHead.next;
				
				super.head = theOne;
				
				return true;
			}
			else {
				iterator = iterator.next;
			}
		}
		
		return false;
	}
}
