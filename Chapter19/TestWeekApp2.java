class TestWeekApp2 {
	//enum型-「定数をまとめる」列挙型ともいう
	//ここでは1週間をまめている
	public enum WEEK {MON, TUE, WED, THU, FRI, SAT, SUN}
	
	public static void main(String[] args) {
									//引数の内容が等しいか
		System.out.println(WEEK.MON.equals(WEEK.TUE));
									//引数の大小比較
		System.out.println(WEEK.MON.compareTo(WEEK.TUE));
		
		for(WEEK w:WEEK.values()){
			if(w.equals(WEEK.WED)) {
				System.out.println(w + "は水曜日");
			}else {
				if(w.compareTo(WEEK.WED) < 0) {
					System.out.println(w + "は水曜日よりも前");
				}else {
					System.out.println(w + "は水曜日よりも後");
				}
			}
		}
	}
}
