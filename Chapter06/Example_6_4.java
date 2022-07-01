
public class Example_6_4 {

	public static void main(String[] args) {
		
		//配列の参照の同じところから見てるから添え字[0]が15なる
		final int[] data1 = {10, 20, 30, 40, 50};
		int[] data2;
		
		//上書きしている→同じところから参照している
		data2 = data1;
		data2[0] = 15;
		
		System.out.print("data1:");
		for(int i = 0; i < data1.length; i++) {
			System.out.print(data1[i] + " ");
		}
		System.out.println();
		
		System.out.print("data2:");
		for(int i =0; i < data2.length; i++) {
			System.out.print(data2[i] + " ");
			
			/* 結果はこうなる 
			 * data1:15 20 30 40 50 
			 * data2:15 20 30 40 50 
			 */
		}
	}

}
