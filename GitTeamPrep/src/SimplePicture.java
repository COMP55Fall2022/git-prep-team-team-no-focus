import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.png", 200, 200);
		add(robot);
		final GLabel label = new GLabel("How I feel when using github hackslash", 200, 400);
		//test
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}