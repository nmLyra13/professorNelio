package secao17b.services;

import java.util.List;

public class CalculationService {

	/*
	 *  * As we can see, the operation is static. So there is no need to instantiate
 * the "CalculationService".
	 */
	public static Integer max(List<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can´t be empty");
		}
		Integer max = list.get(0);
		for (Integer item: list) {
			if (item.compareTo(max)>0) {
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