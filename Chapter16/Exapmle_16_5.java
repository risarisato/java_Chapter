class Exapmle_16_5 {
	public static void main(String[] args) {
		try {
			//Bank2クラスのコンストラクタ
			//in、outメソッドは例外を送出する可能性
			Bank2 tokyo = new Bank2(5000);
			tokyo.in(3000);
			tokyo.out(10000);
		}
		catch (NoMoneyException e) {
			System.out.println(e);
		}
	}
}
