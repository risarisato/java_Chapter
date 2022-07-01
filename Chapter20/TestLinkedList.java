import java.util.LinkedList;
public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> lt = new LinkedList<String>();
		
		//要素の追加
		lt.add("abc");
		lt.add("xyz");
		lt.addFirst("def");
		
		for(String s : lt) 
			System.out.println(s);

		lt.removeFirst();
		
		
		for(int i = 0; i < lt.size(); i++)
			System.out.println(lt.get(i));
		}
	}

