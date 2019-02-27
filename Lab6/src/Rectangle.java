
public class Rectangle extends Polygon {

	private double height;
	private double width;
	
	public Rectangle(String id, double height, double width) {
		super(id);
		super.sideLengths.add(height);
		super.sideLengths.add(height);
		super.sideLengths.add(width);
		super.sideLengths.add(width);
		this.height = height;
		this.width = width;
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
