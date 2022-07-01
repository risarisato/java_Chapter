import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Ex_19_2 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String pass = Security.Create_pass(10);
		
		System.out.println("パスワードを発行します。");
		System.out.println("発行したパスワード：" + pass);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("パスワードを入力：");
		
		String pass2 = br.readLine();
		String str = new String(pass); //String型のインスタンスを生成
		
		//System.out.print(a);
		if(str.equals(pass2)) {
			System.out.println("パスワードが一致しました。");
		} else {
			System.out.println("パスワードが不正です。");
		}

		} catch (IOException e) {
			System.out.println("入出力エラーです。");
		}

	}
}

/* ※格納されている文字列の比較*/
/*参照しているオブジェクトが同じかどうかではなく、例えば 2 つの文字列に格納されている値が
等しいかどうかを調べるには、String クラスで用意されている equals メソッドを使います。
*/