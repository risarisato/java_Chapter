class Circle extends Figure{
	private double r;
	//double型を親クラスに合わせる
	Circle(double r){
		this.r = r;
	}
	public double getArea() {
		return r * r * 3.14;
	}
}
