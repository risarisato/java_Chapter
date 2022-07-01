import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
public class TestMap2 {

	public static void main(String[] args) {
		Map<String, Set<String>> mp = new HashMap<String, Set<String>>();
		
		mp.put("1", new TreeSet<String>());
		mp.put("2", new TreeSet<String>());
		//mp.put("3", new TreeSet<String>());
		//mp.put("0", new TreeSet<String>());
		
		mp.get("1").add("abc");
		mp.get("1").add("def");
		mp.get("2").add("xyz");
		mp.get("2").add("stu");
		//mp.get("3").add("abfc");
		//mp.get("1").add("999999999999999");
		
		Set<String> keys = mp.keySet();
		for(String key : keys) {
			System.out.println(key + ":");
			Set<String> values = mp.get(key);
			for(String value : values)
				System.out.println(value);
		}
	}
}
