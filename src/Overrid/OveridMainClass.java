package Overrid;

public class OveridMainClass {
	public static void main(String [] args){
		Shape [] shapeList = new Shape[2];
		shapeList[0] = new Circle();
		shapeList[1] = new Ambiguous();
		
		for (Shape s:shapeList){
			s.print();
			System.out.println(s.compute());
		}
	}
}
