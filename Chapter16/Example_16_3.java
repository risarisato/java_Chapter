class Example_16_3 {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z;
		
		int[] array = new int[3];
		try {
			z = x / y;
			array[5] = z;
			System.out.println(z);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列参照範囲が正しくありません。");
		}
		catch(ArithmeticException e) {
			System.out.println("0で割りました。");
		}
		finally {
			System.out.println("処理終了");
		}
	}
}
