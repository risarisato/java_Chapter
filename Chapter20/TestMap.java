import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class TestMap {
	public static void main(String[] args) {
		
		//マップ作製
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("1", "abc");//キーと値の組み合わせ追加
		mp.put("3", "def");
		mp.put("2", "xyz");
		mp.put("1", "mno");//上書きする
		
		System.out.println(mp.get("2"));
		
		//keyを見ているけど表示するのはvalueになる
		Set<String> keys = mp.keySet();
		for(String key : keys)
			System.out.println(mp.get(key));
		
		mp.remove("1");//キーを指定して要素を削除
		for(String key : keys)
			System.out.println(mp.get(key));
	}
}
