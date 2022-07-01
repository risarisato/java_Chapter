
public class Example_6_1 {

	public static void main(String[] args) {
		
		//Java配列は宣言して、実体newして扱える
		int total; 	
		int[] data; //配列変数の宣言
		data = new int[3];	//3つの要素をもつ配列を作る
		
		data[0] = 40;
		data[1] = 30;
		data[2] = 83;
		
		total = data[0] + data[1] + data[2];
		
		System.out.println("data[0] = " + data[0]);
		System.out.println("data[1] = " + data[1]);
		System.out.println("data[2] = " + data[2]);
		System.out.println("total = " + total);

	}

}
