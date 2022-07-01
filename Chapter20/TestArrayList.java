import java.util.ArrayList;
import java.util.List;
public class TestArrayList {

	public static void main(String[] args) {
		//リスト作成
		List<String> lt = new ArrayList<String>();
		
		//要素の追加
		lt.add("abc");
		lt.add("xyz");
		lt.add("def");
		
		for(int i = 0; i < lt.size(); i++) {
			System.out.println(lt.get(i));
		}
		System.out.println("----要素1をremove----");
		lt.remove(1);
		
		
		for(int i = 0; i < lt.size(); i++)
			System.out.println(lt.get(i));
		}
	}

