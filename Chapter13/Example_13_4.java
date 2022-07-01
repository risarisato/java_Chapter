class Example_13_4 {
	public static void main(String[] args) {
		Apple a = new Apple();
		System.out.println(a);
		//System.out.println(a.toString());→toString()の処理
		String s = "このプロジェクトは" + a;
		//String s = "このプロジェクトは" + a.toString();省略可能
		System.out.println(s);
	}
}
