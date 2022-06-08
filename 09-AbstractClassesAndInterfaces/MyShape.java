import java.awt.*;

/*
 *
 * MyShape
 *
 */

public abstract class MyShape
{
	// Instance variables for width and height of a shape.
	// Note use of protected modifier to allow direct access by a subclass
	//
	protected int  width, height;


	//
	// ToDo:
	//
	// Add a Constructor. This should initialise all of
	// the instance variables to the values passed in.
	//
	public MyShape(int width, int height){
		this.height = height;
		this.width = width;
	}



}
