public class TstCircle {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj=new Circle(10);
		obj.draw();
		System.out.println("Area= "+obj.getArea());
		Circle c= new Circle(10);
		Rectangle12 obj1=new Rectangle12(10,10);
		obj.draw();
		//c.draw();
		c.getArea();
		obj1.draw();
		obj1.getArea();
		System.out.println("Area= "+obj.getArea());
		System.out.println("Area= "+obj1.getArea());
		System.out.println("Area= "+c.getArea());
	}

}
