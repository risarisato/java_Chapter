import java.io.BufferedReader;
import java.io.IOException;//手順④→java.io*ワイルドカードでその他自動でインポートする
import java.io.InputStreamReader;
class Example_18_1 {

	public static void main(String[] args) {
		//手順①BufferedReaderクラスのオブジェクト変数宣言
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str;
	int ch;
	
	System.err.println("文字を入力してください。");
	
	try {
		//手順②宣言したオブジェクト変数にreadLine()メソッド
		str = br.readLine();
		
		System.out.println(str + "入力してされました。");
		System.out.println("1文字を入力してください。");
		
		ch = br.read();
		System.out.println("文字コード:" + ch + "→" +(char)ch + "入力してされました。");
	}
	//手順③入出力エラーの例外
	catch(IOException e) {
		System.out.println("入出力エラーです");
		}
	}
}
