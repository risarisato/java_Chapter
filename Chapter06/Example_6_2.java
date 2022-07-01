
public class Example_6_2 {
	public static void main(String[] args) {
		
		//Java配列の値が決まっている場合の要素の入れ方
		int[] data = {40, 30, 83};
		
		//配列要素数(data.length)の大きさだけfor文
		for(int i = 0; i < data.length; i++) {
			System.out.println("data[" + i +"] = " + data[i]);
		}
	}

}