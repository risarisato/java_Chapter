//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Testset {

	public static void main(String[] args) {
		
		//HashSetは順番はわからない
		//Set<String> st = new HashSet<String>();
		
		//TreeSetの順番は保証される
		//import java.util.TreeSet;が必要
		Set<String> st = new TreeSet<String>();
		//要素の追加
		st.add("xyz");
		st.add("abc");
		st.add("pqr");
		
		for(String s : st) 
			System.out.println(s);
		
		if(st.contains("abc"))//containsで要素を含むか確認
			System.out.println("abcはセットにいます");
		st.remove("xyz");//要素を削除
		
		//同じ文字列の重複は追加しない
		//st.add("affc");
		
		for(String s : st)
			System.out.println(s);
	}
}
