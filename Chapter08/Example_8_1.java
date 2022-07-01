
public class Example_8_1 {

	public static void main(String[] args) {
		int num1, num2;
		double dbl;
		Adder adr = new Adder();
		num1 = adr.add(10, 20);
		num2 = adr.add(10, 20, 30);
		dbl = adr.add(10.2, 20.3);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("dbl = " + dbl);
	}
}
