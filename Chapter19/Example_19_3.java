//Dateクラスはjava.utilに含まれる
import java.util.Date;
class Example_19_3 {

	public static void main(String[] args) {
		
		//現在時刻の取得
		//Systemクラスのstaticメソッドに"currentTimeMillis()"がある
		long start = System.currentTimeMillis();
		//「A」を100回プリントして
		for(int i = 0; i < 100; i++) {
			System.out.print("A");
		}
		System.out.println();
		
		//「A」をプリントして終わった時間→現時刻取得
		long end = System.currentTimeMillis();
		
		Date d = new Date(start);
		System.out.println("現在時刻：" + d);
		
		d.setTime(end);
		System.out.println("終了時刻：" + d);
		
		long time = end - start;
		System.out.println("処理に要した時間は" + time + "ミリ秒。");
	}

}
