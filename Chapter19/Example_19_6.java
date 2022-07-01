import java.util.StringTokenizer;
class Example_19_6 {

	public static void main(String[] args) {
		String str = "1,2, 3..hustle!元気ですかー";
		
											//デミリタを指定
		//IoTなどで、データを取得するために区切りたいときに使用できる
		//AIなど単語を区切りたいとき
		StringTokenizer st = new StringTokenizer(str, ",.!");
		System.out.println("単語数"+ st.countTokens() + "です");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
