

/*
 *
 * MyRectangle
 *
 */

public class MyRectangle extends MyShape implements Computable
{

	//
	// ToDo:
	//
	// Add a constructor which takes 2 arguments: width and height
	//
	// You will need to pass these on to the constructor of the superclass
	// Remember how to call a superclass constructor? 
    public MyRectangle(int width, int height){
        super(width, height);
    }





	//
	// ToDo:
	//
	// Implement the calculateArea() method defined in the superclass.
	//
    public double calculateArea(){
        return width*height;
    }

    public String toString(){
        return "The area of this rectangle is " + calculateArea();
    }

}
