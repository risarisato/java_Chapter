
public class Example_6_3 {
	
	public static void main(String[] args) {
		
	int[] scores = {82, 23, 37, 64, 51, 30, 59, 15, 48, 90};
	int total = 0, pass = 0;
	
	for(int i = 0; i < scores.length; i++) {
		total += scores[i];
		if(scores[i] >= 80) {
			pass++;
		}
	}

	System.out.println("合格者人数:" + pass);
	System.out.println("合格率(%):" + pass*100.0/scores.length);
	System.out.println("平均点:" + (double)total/scores.length);

	}
}
