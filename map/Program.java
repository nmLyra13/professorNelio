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
		cookies.put("phone","1133")

		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
