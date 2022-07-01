
public class TestVariableApp {
		//紹介程度でこうゆう書き方もあるって知っておく程度で！
		//printAll(String ... strings)で配列を入れている
		public static void printAll(String ... strings){
			for(String s : strings) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
		
	public static void main(String[] args) {
		
		String s1 = new String("This is");
		String s2 = new String("an apple");
		String s3 = new String("not");
		
		printAll(s1, s2);
		printAll(s1, s3, s2);
	}
}
