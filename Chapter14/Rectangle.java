class Rectangle extends Figure {
	private double x, y;
	Rectangle(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getArea() {
		return x * y;
	}
}
