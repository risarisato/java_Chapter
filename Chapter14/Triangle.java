class Triangle extends Figure {
	private double l,h;
	//double型を親クラスに合わせる
	Triangle(double l, double h){
	this.l = l;
	this.h = h;
	}
	public double getArea() {
		return l * h / 2;
	}
}
