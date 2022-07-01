//Threadクラスの拡張
class Printer extends Thread {
	//スレッドが実行する処理
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print("T");
		}
	}
}
