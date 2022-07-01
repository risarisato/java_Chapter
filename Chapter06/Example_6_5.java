
public class Example_6_5 {

	public static void main(String[] args) {
		
		//配列は配列変数を参照するので実体化する必要がある
		//要するに配列をもう1つ作ったってこと！！
		final int[] data1 = {10, 20, 30, 40, 50};
		final int[] data2 = new int[data1.length];
		
		for(int i = 0; i < data1.length; i++) {
			data2[i] = data1[i];
		}
		
		//data2 = data1;
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
			 * data1:10 20 30 40 50 
			 * data2:15 20 30 40 50 
			 */
		}
	}

}
