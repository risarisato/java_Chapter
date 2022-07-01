class Example_19_11 {

	//匿名クラスとか無名関数とかラムダ式とか
	//その場で１回しかつわない関数のこと
	public static void main(String[] args) {
		Person3 p = new Person3("匿名太郎", "XYZ");
		
		p.show();						//名前のみ表示
		p.setDetails(25, 55.0, "XXX");	//詳細(パスワード違い)
		p.setDetails(25, 55.0, "XYZ");	//詳細
		p.show("XXX");					//詳細(パスワード違い)
		p.show("XYZ");					//詳細
	}
}
