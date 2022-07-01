
public class Example_3_3 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5, sum = 0; 
		
		
		num1 += 2;
		num2 *= 2;
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		
		sum += num1;
		sum += num2;
		
		System.out.println("num1 + num2 = " + sum);
	}
}
