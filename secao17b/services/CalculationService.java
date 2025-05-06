package secao17b.services;

import java.util.List;

public class CalculationService {

	/*
	 * As we can see, the operation is static. So there is no need to instantiate
	 * the "CalculationService".
	 */
	
	// operation receives a list of integers
	public static Integer max(List<Integer> list) {
		// This is a defensive schedule. It cannot be an empty list.
		if (list.isEmpty()) {
			throw new IllegalStateException("List can´t be empty");
		}
		// get first element from list -> list.get(0)
		Integer max = list.get(0);
		// scan the list
		for (Integer item : list) {
			
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}

/*
 * As we can see, the operation is static. So there is no need to instantiate
 * the "CalculationService".
 * 
 * Como podemos observar. A operação é estática. Então não é preciso instaciar o
 * "CalculationService".
 *
 * 
 */