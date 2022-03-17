/**
 * An unordered collection of unique elements.
 *
 * Each implementation must have a parameterless
 * constructor which initializes an empty set.
 */
public interface Set {
	/**
	 * Adds an element to the set, or
	 * does nothing if it is already in the set.
	 *
	 * @param element The element to add.
	 * @return Whether the element was added.
	 */
	boolean add(int element);
	
	/**
	 * Removes an element from the set, or
	 * does nothing if it is not in the set.
	 *
	 * @param element The element to remove.
	 * @return Whether the element was removed.
	 */
	boolean remove(int element);
	
	/**
	 * Queries whether an element is contained in the set.
	 *
	 * @param element The element to query.
	 * @return Whether the element is contained.
	 */
	boolean contains(int element);
	
	/**
	 * Retrieves the size of the set, which is
	 * the number of elements it contains.
	 *
	 * @return The size of the set.
	 */
	int size();
}
