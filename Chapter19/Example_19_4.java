import static java.lang.Math.*;
class Example_19_4 {

	public static void main(String[] args) {
		double r = 5.0;
		
		//double s = 4.0 * Math.PI * Math.pow(r, 2.0);
		
		//double v = 4.0 / 3.0 * Math.PI * Math.pow(r, 3.0);
		
		double s = 4.0 * PI * pow(r, 2.0);
		
		double v = 4.0 / 3.0 * PI * pow(r, 3.0);
		
		System.out.println("半径" + r + "の球の");
		System.out.println("表面積は" + s);
		System.out.println("体積" + v + "です");

	}

}
