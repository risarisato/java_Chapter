
public class Example_9_4 {

	public static void main(String[] args) {
		
		String str1 = "ABC";
		String str2 = "XYZ";
		
		boolean flg1 = str1.equals(str2);
		boolean flg2 = str1.equals("ABC");
		
		
		System.out.println("str1とstr2は同じ文字列か？：" + flg1);
		//バックスラッシュで"ABC"を強調するため
		System.out.println("文字列str1は\"ABC\"か？：" + flg2);
		
		System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		
		//コンスタントプールと言い、昔のあったやつを使う
		String str3 = "ABC";//str1に先にABCがあるので同じメモリ上を参照している
		
		String str4 = new String("ABC");//ABCは既にあるが、newで別のインスタンスで中身は同じでもメモリが違う
		
		System.out.println("str1と\"ABC\"は同じインスタンスか?："+ (str1 == str3));
		System.out.println("str1とnew String(\"ABC\")は同じインスタンスか?："+ (str1 == str4));
		}
}
