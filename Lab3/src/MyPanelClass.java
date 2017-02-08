import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                      //Draw a border
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1 + 63, width + 1, (height/2) - 45);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, y1 + 32);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1, y2 - 30, width + 1, y2);
                        
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1 + 3, y1 + 3, width - 6, height - 6);
                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
                        
//                        g.setColor(Color.GRAY);
//                        g.drawLine(x2, y1, x1, y2);
                        
//                        g.setColor(Color.DARK_GRAY);
//                        g.fillOval((width-55)/2, (height-55)/2, 55, 55);
                        
                        Polygon p = new Polygon();
                        p.addPoint(x1, y1);
                        //p.addPoint(x1 + 20, y1 + 10);
                        //p.addPoint(x1 + 35, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(width/2, height/2);
                       // p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1, y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 15, y1 + 73);
                        p2.addPoint(x1 + 31, y1 + 73);
                        p2.addPoint(x1 + 37, y1 + 58);
                        p2.addPoint(x1 + 43, y1 + 73);
                        p2.addPoint(x1 + 59, y1 + 73);
                        p2.addPoint(x1 + 46, y1 + 83);
                        p2.addPoint(x1 + 51, y1 + 98);
                        p2.addPoint(x1 + 37, y1 + 88);
                        p2.addPoint(x1 + 24, y1 + 98);
                        p2.addPoint(x1 + 28, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}

