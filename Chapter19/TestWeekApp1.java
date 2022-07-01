class TestWeekApp1 {
	
	//enum型-「定数をまとめる」列挙型ともいう
	//ここでは1週間をまめている
	public enum WEEK {MON, TUE, WED, THU, FRI, SAT, SUN}
	
	public static void main(String[] args) {
		System.out.println(WEEK.MON);//toString()を自動的に使用
		for(WEEK w : WEEK.values()) {
			System.out.print(w + " ");
		}
	}
}
