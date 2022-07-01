
class Example_10_1 {

	public static void main(String[] args) {
		Car[] c = new Car[5];	//オブジェクト配列car[]型
		//String[]型の2つのインスタンスがある
		String[] numbers = {"1111", "2222", "3333", "4444", "5555"};
		
		for(int i = 0; i < 5; i++) {
			c[i] = new Car(numbers[i]);
		}
		System.out.println("新車台数" + Car.count);

	}

}
