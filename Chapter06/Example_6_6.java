
public class Example_6_6 {

	public static void main(String[] args) {
				//2次元配列の縦3行・横4列
		int[][] data = new int[10][10];
		int num = 1;
		
		for(int row = 0; row < data.length; row++) {
			for(int column = 0; column < data[row].length; column++) {
				data[row][column] = num;
				num++;
			}
		}
		//こっちはfor文でprint表示しているだけ
		for(int row = 0; row < data.length; row++) {
			for(int column = 0; column < data[row].length; column++) {
				System.out.print(data[row][column] + " ");
			}
			System.out.println();
		}
	}
}
