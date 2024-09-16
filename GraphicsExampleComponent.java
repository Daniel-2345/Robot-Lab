/**
 *  GraphicsExampleComponent.java
 *  Extend JComponent to draw 2D shapes
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
 
public class GraphicsExampleComponent extends JComponent
{
	@Override
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D object
		Graphics2D g2 = (Graphics2D) g;
		
		// Get size of component window
		int width = getWidth();
		int height = getHeight();
    
		
		// Sky
		Color LightBlue = new Color(122, 188, 245);
		g.setColor(LightBlue);
    g.fillRect(0, 0, 699, 799);

		//Clouds
		Color Grey = new Color(225, 226, 227);
		g.setColor(Grey);
		g.fillOval(30, 40, 150, 56);
		g.fillOval(34, 38, 27, 28);
		g.fillOval(21, 52, 27, 28);
		g.fillOval(161, 52, 27, 26);
		g.fillOval(55, 33, 27, 28);
		g.fillOval(55, 70, 27, 28);
		g.fillOval(34, 38, 27, 28);
		g.fillOval(36, 63, 27, 28);
		g.fillOval(75, 28, 27, 28);
		g.fillOval(95, 31, 27, 28);
		g.fillOval(115, 33, 27, 28);
		g.fillOval(135, 35, 27, 28);
		g.fillOval(148, 44, 27, 28);
		g.fillOval(155, 63, 27, 28);
		g.fillOval(95, 76, 27, 28);
		g.fillOval(75, 74, 27, 28);
		g.fillOval(115, 74, 27, 28);
		g.fillOval(135, 73, 27, 28);

		g.fillOval(190, 15, 150, 56);
		g.fillOval(194, 13, 27, 28);
		g.fillOval(181, 27, 27, 28);
		g.fillOval(321, 27, 27, 26);
		g.fillOval(215, 8, 27, 28);
		g.fillOval(215, 45, 27, 28);
		g.fillOval(194, 13, 27, 28);
		g.fillOval(196, 38, 27, 28);
		g.fillOval(235, 3, 27, 28);
		g.fillOval(255, 6, 27, 28);
		g.fillOval(275, 8, 27, 28);
		g.fillOval(295, 10, 27, 28);
		g.fillOval(308, 19, 27, 28);
		g.fillOval(315, 38, 27, 28);
		g.fillOval(255, 51, 27, 28);
		g.fillOval(235, 49, 27, 28);
		g.fillOval(275, 49, 27, 28);
		g.fillOval(295, 48, 27, 28);
		
		//Grass
		Color grassGreen = new Color(26, 217, 99);
		g.setColor(grassGreen);
		g.fillRect(0, 290,  2000, 150);
		Color DarkGreen = new Color(10, 87, 39);
		g.setColor(DarkGreen);
		g.drawLine(5, 300, 6, 285);
				// Grass Loop

				for (int x = 5; x <= 605; x += 10) {  
						int yStart = 295; 
						int yEnd = 280;    
						g.drawLine(x, yStart, x + 1, yEnd);  
				}
				for (int x = 0; x <= 600; x += 10) {  
						int yStart = 305;  
						int yEnd = 290;    
						g.drawLine(x, yStart, x + 1, yEnd);  
				}
				for (int x = 5; x <= 605; x += 10) {  
						int yStart = 315;  
						int yEnd = 300;    
						g.drawLine(x, yStart, x + 1, yEnd);  
				}
				for (int x = 0; x <= 600; x += 10) { 
						int yStart = 325;  
						int yEnd = 310;   
						g.drawLine(x, yStart, x + 1, yEnd);  
				}
		//Sun
		Color YellowOrange = new Color(245, 180, 69);
		g.setColor(YellowOrange);
		g.drawLine(508, 14, 549, 7);
		g.drawLine(509, 15, 550, 8);
		g.drawLine(510, 16, 551, 9);
		g.drawLine(526, 51, 556, 29);
		g.drawLine(527, 52, 557, 30);
		g.drawLine(528, 53, 558, 31);
		g.drawLine(556, 76, 564, 64);
		g.drawLine(557, 77, 565, 65);
		g.drawLine(558, 78, 566, 66);
		g.drawLine(589, 89, 589, 69);
		g.drawLine(590, 90, 590, 70);
		g.drawLine(591, 91, 591, 71);
		g.fillOval(525,-75,150,150);
		
		
    // Name
		g2.setColor(Color.blue);
		g2.drawString("Author: Daniel", 5, 15);
		
		// Robot
		Color Brown = new Color(110, 62, 35);
		g.setColor(Brown);
    g.fillOval(225, 285, 30, 14);
		g.fillOval(285, 285, 30, 14);

		
		
    //draw eyes
		g.setColor(Color.black);

		/**  old samples, do not uncomment
		// Draw a solid purple rectangle 
		Color purple = new Color(150, 50, 250);
		g2.setColor(purple);
		box = new Rectangle(width / 2 + 5, 10, 30, 50);
		g2.fill(box);
		
		// Draw outline of a blue ellipse 
		g2.setColor(Color.blue);
		Ellipse2D.Double ellipse = new Ellipse2D.Double(5, height / 2 + 10, 70, 40);
		g2.draw(ellipse);
		
		// Draw a solid magenta circle 
		g2.setColor(Color.magenta);
		double circleX = width / 2 + 5;
		double circleY = height / 2 + 10;
		double diameter = 70;
		Ellipse2D.Double circle = new Ellipse2D.Double(circleX, circleY, diameter, diameter);
		g2.fill(circle);
		
		
		
		 **/
	}
}
