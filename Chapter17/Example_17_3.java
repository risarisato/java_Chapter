class Example_17_3 {
	public static void main(String[] args) {
		
		//Printer3インスタンスを3つ作成
		Printer3 pa = new Printer3("A");
		Printer3 pb = new Printer3("B");
		Printer3 pc = new Printer3("C");
		
		//それぞれのstart()で呼び出す
		pa.start();
		pb.start();
		pc.start();

		for(int i = 0; i < 10; i++) {
			System.out.print("M");
		}
	}

}
