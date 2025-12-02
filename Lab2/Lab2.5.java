package Lab;

import java.util.Scanner;

	class Rectangle { 

	    private double width;
	    private double height;

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }
	    
	    public double getArea() {
	        return width * height;
	    }
	
	    public double getPerimeter() {
	        return 2 * (width + height);
	    }
	}

	public class Lab2_5 {
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	        double inputWidth = scanner.nextDouble();	        
	        double inputHeight = scanner.nextDouble();
	        
	        Rectangle myRectangle = new Rectangle(inputWidth, inputHeight);
	        
	        System.out.println(myRectangle.getArea()); 
	        System.out.println(myRectangle.getPerimeter());
	        
	        scanner.close();
	    }
	}
