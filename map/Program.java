package map;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		/*
		 * We are using TreeMap<Sort by key>
		 */
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");

		cookies.remove("email");
		cookies.put("phone", "1133");

		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}

/*
 * But what is a map? It is a collection of key/value pairs.
 * 
 * Elements are indexed by the key object; Elements are indexed by the key
 * object (they have no position) Access, insertion and removal of elements are
 * fast.
 * 
 * Main implementations: HashMap: faster and unordered; TreeMap: slower and
 * ordered by the object's compareTo; LinkedHashMap: Intermediate speed and
 * elements in the order they are added.
 * 
 * Some important methods:
 *
 * put(key, value), remove(key), containsKey(key), get(key) note:
 * 
 * a) These are based on equals and hashCode; b) If equals and hashCode do not
 * exist, pointer comparison is used. c) clear(); d) size(); e) KeySet() -
 * returns a Set<K>; f) values() - returns a Collection<V>.
 *
 */
