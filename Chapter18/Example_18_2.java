//手順④java.io*ワイルドカードでその他自動でインポートする 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Example_18_2 {

	public static void main(String[] args) {
		String str;
		try {
			//手順①BufferedReaderクラスのオブジェクト変数宣言読込むだけ
			BufferedReader br = new BufferedReader(new FileReader("in.txt"));
			//読込んだものを書き出す
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
			
			//手順②宣言したオブジェクト変数にreadLine()メソッドで1文字・1行文を読込む
			while((str = br.readLine()) != null) {
				System.out.println(str);
				pw.println(str);
			}
			//手順⑤ファイルをクローズする→リソースを開放しなと接続や立上げが出来なくなる可能性
			br.close();
			pw.close();
		}
		//手順③入出力エラーの例外
		catch(FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません");
		}
		catch(IOException e) {
			System.out.println("入出力エラーです。");
		}

	}

}
