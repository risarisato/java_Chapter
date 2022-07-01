
class Car {
	public static int count; //staticクラス変数1つだけの共通
	private String number;	 //インスタンス変数
	
	//thisでnumberを扱っている
	public Car(String number) {
		this.number = number;
		count++;
		System.out.println("ナンバー" + number + "の新車を作りました。");
	}

}
