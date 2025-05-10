package set;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		/* Set<T> Represents a set of elements (similar to algebra) 
		 * 1. Does not allow repetitions; 
		 * 2. Elements do not have a position; 
		 * 3. Access, insertion and removal of elements are fast; 
		 * 4. Provides efficient set operations:
		 * 		intersection, union, difference; 
		 * 5. Main implementations: 
		 * 		a) HashSet: Faster (O(1) operations in hash table) and unordered; 
		 * 		b) TreeSet: Slower (O(log(n)) operations in red-black tree) and ordered 
		 * 			by the object's compareTo (or Comparator) 
		 * 		c) LinkedHashSet: Intermediate speed and elements in the order
		 * 			they are added.
		 *
		 * add(obj), remove(obg), contains(obj) 
		 * 		a) Based on equals and hashcode; 
		 * 		b) If equals and hashcode do not exist, pointer comparison is used. 
		 * 
		 * clear() 
		 * size()
		 * removeIf(predicate)
		 * 
		 * addAll(other) - union: Adds the elements of the other set to the set, without
		 * 							repetition. 
		 * retainAll(other) - intersection: removes from the set the elements not contained
		 * 							 in other; 
		 * removeAll(other) - difference: removes from the set the elements contained in other.
		 *
		 */
		Set<String> set = new HashSet<>(); 
		/*
		 * Here we have the fastest implementation with HashSet. 
		 * But it does not guarantee the order.		
		 */
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		System.out.println(set.contains("Notebook")); 
		
		for (String p : set) {
			System.out.println(p);	
		}	
	}
}
