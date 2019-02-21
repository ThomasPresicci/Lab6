
public class Rectangle extends Polygon {

	private double height;
	private double width;
	
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

	@Override
	public String getShapeType() {
		return "Rectangle";
	}

}
