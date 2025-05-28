package map;

import java.util.Map;
import java.util.TreeMap;

public class Program2 {

	public static void main(String[] args) {

		/*
		 * String type already has "equals hashCode" and "Compare to" implemented. We
		 * can then use "TreeMap<>" directly.
		 * 
		 */

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");

		System.out.println("Conteins 'phone' key:" + cookies.get("phone"));

		cookies.remove("email");
		cookies.put("phone", "99711133");

		System.out.println("ALL COOKIES: ");

		/*
		 * the keyset() function returns a Set<K> with the keys of the set.
		 * cookies.keySet() takes the keys of the map in the form of a set.
		 */

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}
}
