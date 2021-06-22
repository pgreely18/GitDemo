package sections33and34CoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "goodbye");
		hm.put(2, "morning");
		hm.put(3, "evening");
		hm.put(4, null);
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry np = (Map.Entry)it.next();
			System.out.println(np.getKey());
			System.out.println(np.getValue());
		}
	}

}
