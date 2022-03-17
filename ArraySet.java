/**
 * Stores the elements in a linear searched, dynamically resizing, partially filled array.
 * The array must double in length when it is full after an add, and it must halve 
 * in length when it is a quarter full or less after a remove.
 * @author Peter Decker
 */
public class ArraySet implements Set{
	private int[] data;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 5;
	
	public ArraySet(int capacity) {
		if(capacity < 0)
			throw new IllegalArgumentException();
		this.data = new int[capacity];
		this.size = 0;
	}
	
	@Override
	public boolean add(int element) {
		if(this.contains(element))
			return false;
		
		this.data[size] = element;
		this.size++;
		
		//check if it is now full. If yes double length.
		if(size() == this.data.length) {
			int capacity = this.data.length * 2;
			int[] temporary = new int[capacity];//Creates a temporary array
			for(int i = 0; i < this.data.length; i++) {
				temporary[i] = this.data[i];
			}//Fills the temporary array with all elements in the current data.

			this.data = temporary;//Now double the capacity with all elements transfered back
		}
		
		return true;
	}

	@Override
	public boolean remove(int element) {
		if(!this.contains(element))
			return false;
		
		int position = 0; //Position of the element in the array
		
		for(int i = 0; i < this.size; i++) {//linear search
			if(this.data[i] == element) {
				position = i;
			}	
		}
		
		this.data[position] = 0;//Removes element
		
		if(position < this.size) {//Moves all elements to the right of removed element one left. Only if not last position
			for(int i = position; i < this.size - 1; i++) {
				this.data[i] = this.data[i+1];
			}
		}
		
		size--;
		
		if(size() <= this.data.length/4) { //check if it is now less than or equal to a quarter filled. If yes half the capactiy
			int capacity = this.data.length / 2;
			int[] temporary = new int[capacity];//Creates a temporary array
			for(int i = 0; i < this.size; i++) {
				temporary[i] = this.data[i];
			}//Fills the temporary array with all elements in the current data.

			this.data = temporary;//Now half the capacity with all elements transfered back
		}
		
		return true;
	}

	@Override
	public boolean contains(int element) {
		for(int i = 0; i < this.size; i++) {//linear search
			if(this.data[i] == element) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int size() {
		return size;
	}
}
