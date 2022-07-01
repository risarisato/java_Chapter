
public class Example_9_3 {
	
	public static void main(String[] args) {
		
		
		String str = "ABCDE";
		
		/*
		 * Stringクラスに代表的なメソッドがある
		 *・srt.length()なら文字列の長さ
		 *・str.charAt(3)なら引数で指定された文字を返す
		 *・str.indexOf('C')なら文字列の最初Cは0から何番目
		 */
		System.out.println(str + "の長さ" + str.length());
		System.out.println(str + "の3番目の文字は" + str.charAt(3));
		System.out.println("文字cは" + str.indexOf('C') + "番目");
		}
	}
