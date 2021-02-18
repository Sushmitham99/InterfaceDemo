
public class Rectangle12 implements Shape {
	private double width;
	private double height;

	public Rectangle12(double width, double height) {
	    super();
	    this.width = width;
	    this.height = height;
	}


	@Override
	public void draw() {
		System.out.println("Drawing rectangle");


	}

	@Override
	public double getArea() {
		return this.height*this.width;
	
	}

}



