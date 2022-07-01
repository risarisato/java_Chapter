
public class TestForStateApp {

	public static void main(String[] args) {
		int[] table = new int[10];
		
		//従来のfor文
		for(int i = 0; i < table.length; i++) {
			table[i] = i;
			System.out.println("従来のfor" + i);
		}
		
		//Java特有→拡張のfor文、この１行だけで済む
		//配列データを1回だけ1つずつ処理する
		for(int element : table) {			
			System.out.print(element + " ");
		}

	}

}
