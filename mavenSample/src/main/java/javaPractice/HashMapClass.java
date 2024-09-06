package javaPractice;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap <Integer, String> a1 = new  HashMap<>();
		a1.put(1995, "gani");
		a1.put(1997, "suresh");
		a1.put(1999, "raja");
		System.out.println("map objects or "+a1);
		a1.put(1995, "ganendra");
		System.out.println("after adding duplicates  keys "+a1);
		a1.put(2000, "raja");
		System.out.println(a1.keySet());
		System.out.println(a1.values());
		System.out.println("after adding duplicates values "+a1);
		System.out.println("a1 containns key "+a1.containsKey(1995));
		System.out.println("a1 contains value "+ a1.containsValue("ganendra"));
	}

}
