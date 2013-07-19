package Overrid;

public class Circle extends Shape{
	private double radius = 5;
	public void print(){
		System.out.println("Circle");
	}
	public double compute(){
		return radius*radius*3.14;
	}
}
