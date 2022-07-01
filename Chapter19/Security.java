import java.util.Random;

class Security {
	//intで受けたのものをString型かえす
	public static String Create_pass(int number) {
	//public void Create_pass(int number) {
	//public void Create_pass() {
	Random r = new Random();
	
	char[] ps = new char[number];
	
	for(int i  = 0; i < ps.length; i++) {
		ps[i] = (char)r.nextInt(33,122);
	}
		//文字を初期化するのでnew
		return new String(ps);
	}
}

