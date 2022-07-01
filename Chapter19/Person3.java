//外部クラス
class Person3 {
	private String name;//名前
	private String pass;//パスワード
	private Details d;	//内部クラスの変数
	
	public Person3(String name, String pass) {
		this.name = name;
		this.pass = pass;
		d = new Details();
	}
	
	public void setDetails(int age, double weight, String pass) {
		if(this.pass.equals(pass)) {
			d.in_setDetails(age, weight);//内部クラスのメソッドを呼び出す
		}
		else {
			System.err.println("パスワードが違います。");
		}
	}
	public void show() {
		System.out.println("名前："+ name);
	}
	public void show(String pass) {
		if(this.pass.equals(pass)) {
			d.in_show();//内部クラスのメソッドを呼び出す
		}
		else {
			System.out.println("パスワードが違います。");
		}
	}

	
	//内部クラス→クラスをカプセル化している
	//1回しか使わないとかに使う
	class Details {
		private int in_age;
		private double in_weight;
		
		private void in_setDetails(int age, double weight) {
			in_age = age;
			in_weight = weight;
		}
		
		private void in_show() {
			System.out.print("名前：" + name);
			System.out.print("　年齢：" + in_age);
			System.out.println("　体重：" + in_weight);
		}
	}
}
