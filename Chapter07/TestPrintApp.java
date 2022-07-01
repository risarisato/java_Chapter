
public class TestPrintApp {

	public static void main(String[] args) {
		int i = 10;
		String s = new String("test");
		
		//ちなみに、C言語のprintfと考え方と同じ
		//文字列で表示しているのでprintf
		System.out.printf("整数 = %d, 文字列 = %s", i, s);
		System.out.println();
		System.out.println("整数 = %d, 文字列 = %s, i, s");
		//printfは書式付きの表示を行うためのメソッド
	}
}
