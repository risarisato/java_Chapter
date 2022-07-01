
public class Example_4_4 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int year = 2000;
		
		if(year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "年はうるう年です。");
		}
		else {
			System.out.println(year + "年は平均です。");
		}
	}
}
