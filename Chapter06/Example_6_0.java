
class Example_6_0 {

	public static void main(String[] args) {
		//2次元配列から九九を表示するプログラム
		int[][] data = new int[9][9];
				
		for(int A = 0; A < data.length; A++) {
			for(int B = 0; B < data[A].length; B++) {
				data[A][B] = (A+1)*(B+1);
				
			}
		}
		System.out.println("２次元配列の拡張forで表示させる");
		
		
		for(int[] kuku1: data ) {
			//for(int kuku2: data2 ) {
			//System.out.print(kuku1 + "\t");
		
			//System.out.println();
			
		for(int kuku2: kuku1 ) {
			System.out.print(kuku2 + "\t");
		}

		/*
		//こっちはfor文でprint表示しているだけ
		for(int A = 0; A < data.length; A++) {
			for(int B = 0; B < data[A].length; B++) {
				System.out.print(data[A][B] + "\t");
			}
		*/
			//System.out.println();
		}
	}
}
