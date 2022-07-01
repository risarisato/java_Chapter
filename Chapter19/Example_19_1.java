class Example_19_1 {

	public static void main(String[] args) {
		//引数がオブジェクトでも渡せるようなるラッパクラス
		//すべてObject型の配列に格納できる
		Object[] obj = {
				new String("なんでもOK!"),/*
				new Integer(5),
				new Double(1.41421356),
				new Boolean(true),
				new Character('あ')
				
				//2行は同じことをしている
				Integer A = new Integer(5);
				Integer B = Integer.valueOf(5);
				*/
				//新しいラッパクラスの書き方
				Integer.valueOf(5),
				Double.valueOf(1.41421356),
				Boolean.valueOf(true),
				Character.valueOf('あ'),
		};
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}
