class Ex_Random {

	public static void main(String[] args) {
		
		System.out.println("パスワードを発行します。");
		
		//これはダメなやつ
		//Security A = new Security.();
		
		//staticメソッドを呼び出すやり方
		String A = Security.Create_pass(10);
		
		System.out.println("発行したパスワード："+ A);
	}
}
