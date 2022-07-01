
public class Example_5_10 {
	public static void main(String[] args) {
		
		//多重ループ、break文で最も内側のループのみ抜ける
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j > i) {
					break;
				}
				System.out.println("i=" + i + ", j =" + j);
			}
			System.out.println();
		}
	}
}

