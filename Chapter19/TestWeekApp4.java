class TestWeekApp4 {
	//enum型-「定数をまとめる」列挙型ともいう
	//ここでは1週間をまめている
	public enum WEEK {MON, TUE, WED, THU, FRI, SAT, SUN}
	
	public static void main(String[] args) {
		
		for(WEEK w: WEEK.values()) {
		
			//switch文でcaseにラベル指定する
			switch(w){
				case MON:
				case THU:
					System.out.println(w + "は燃えるゴミの日");
					break;
				case WED:
					System.out.println(w + "は資源ゴミの日");
					break;
				default:
					System.out.println(w + "はゴミ出し禁止");
			}
		}
	}
}