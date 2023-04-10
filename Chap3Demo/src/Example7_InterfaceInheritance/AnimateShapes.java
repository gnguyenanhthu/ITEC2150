package Example7_InterfaceInheritance;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: AnimateShapes
 *
 */
public class AnimateShapes
{
	public static void main(String[] args)
	{
		Shape[] shapes = new Shape[3];

		shapes[0] = new Circle("blue", true, 30, 30, 5);  // center at (30, 30), radius 5
		shapes[1] = new Rectangle("orange", false, 50, 100, 30, 15); // upper-left corner (50, 100), width 30, height 15
		shapes[2] = new Circle("red", false, 250, 250, 20); // center at (250, 250), radius 20	
		
		for (Shape p: shapes) 
		{
			p.talk();
			p.flipRight();
			p.talk();
			p.flipLeft();
			p.talk();
			p.flipUp();
			p.talk();
			p.flipDown();
			p.talk();
			System.out.println();
		}
	}
}
