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
		add(label);
		
		System.out.println("WESBROOK");
		System.out.println(".");
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}