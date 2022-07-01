
public class Example_8_7 {

	public static void main(String[] args) {
		ItemCase ic;
		ic = new ItemCase(new Item(1, 100), new Item(2, 200));
		/*						Item1インスタンス100
		 * ItemCaseインスタンスの中に
		 *						Item2インスタンス200
		 */
		ic.show();
		System.out.println("Item1's number = " + ic.it1.number);
		//icはItemcaseのアドレスをしめしている。
		System.out.println("icは" + ic + "です");
	}
}
