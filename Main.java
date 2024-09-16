/**
 *	GraphicsExample.java
 *  Demonstrate drawing shapes in a component
 */

import javax.swing.JFrame;

public class Main //GraphicsExample
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 600;
		final int FRAME_HEIGHT = 500;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocation(5, 5);
		frame.setTitle("Graphics Examples");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Draw shapes
		GraphicsExampleComponent example = new GraphicsExampleComponent();
		frame.add(example);
		
		// Show it
		frame.setVisible(true);
	}
}