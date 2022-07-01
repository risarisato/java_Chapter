
//インスタンスでnewを作ってもいいがstaticとして「単なる関数」になる
//逆にstaticがないと実行できない
public class Calc {
	public static double add(double operand1, double operand2) {
		return operand1 + operand2;
	}
	public static double sub(double operand1, double operand2) {
		return operand1 - operand2;
	}
	public static double multi(double operand1, double operand2) {
		return operand1 * operand2;
	}
	public static double div(double operand1, double operand2) {
		return operand1 % operand2;
	}
}
