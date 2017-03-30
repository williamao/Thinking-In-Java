import Shape.*;
public class Exercise2 {
	private static RandomShapeGenerator generator=new RandomShapeGenerator();
	public static void main(String[] args) {
	 Shape[] shapes=new Shape[10];
	  for(int i=0;i<shapes.length;i++)
		  shapes[i]=generator.next();
	  for (Shape s:shapes)
		    s.draw();  
	}
}