import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.png", 200, 200);
		add(robot);
<<<<<<< HEAD
		final GLabel label = new GLabel("MICHAEL CHANGE", 200, 400);
=======
		final GLabel label = new GLabel("WES STEP 8", 200, 400);
>>>>>>> branch 'main' of https://github.com/COMP55Fall2022/git-prep-team-team-no-focus.git
		add(label);
		
		System.out.println("WESBROOK");
		System.out.println("x");
		System.out.println("xx");
		System.out.println("xxx");
		System.out.println("xxxx");
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}