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
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                      
                        
                       
                        
                     // Franjas blancas
                        g.setColor(Color.WHITE);
                        g.fillRect(0, this.getHeight()/5, this.getWidth(), ((this.getHeight())/5));
       
                        g.setColor(Color.WHITE);
                        g.fillRect(0, (3*this.getHeight()/5), this.getWidth(), (this.getHeight()/5));
                    
                        // Triangulo
                        Polygon p3 = new Polygon();
                        p3.addPoint( 0, 0);
                        p3.addPoint(x2/2, y2/2);
                        p3.addPoint(0, y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        g.drawPolygon(p3);
                        
                        // Estrella
                        Polygon p2 = new Polygon();
                        p2.addPoint(this.getWidth()/12, 11*this.getHeight()/24);
                        p2.addPoint(11*this.getWidth()/78, 11*this.getHeight()/24);
                        p2.addPoint(this.getWidth()/6, 8*this.getHeight()/24);
                        p2.addPoint(14*this.getWidth()/72, 11*this.getHeight()/24);
                        p2.addPoint(18*this.getWidth()/72, 11*this.getHeight()/24);
                        p2.addPoint(15*this.getWidth()/72, 13*this.getHeight()/24);
                        p2.addPoint(16*this.getWidth()/72,  16*this.getHeight()/24);
                        p2.addPoint(this.getWidth()/6, 14*this.getHeight()/24);
                        p2.addPoint(8*this.getWidth()/72,  16*this.getHeight()/24);
                        p2.addPoint(10*this.getWidth()/80, 13*this.getHeight()/24);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        g.drawPolygon(p2);
            }
}

