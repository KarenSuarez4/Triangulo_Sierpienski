package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
    private int level;
    
    public Panel(int lev){
        this.level = lev;
    }

    public void paintTriangleRescusive(Graphics g, int level, int[] x, int[] y){
        if (level == 0){
            g.setColor(Color.BLACK);
            g.fillPolygon(x, y, 3);
    
        } else {
            int[] xMiddle = {(x[0] + x[1])/2, (x[1] + x[2])/2, (x[0] + x[2])/2};
            int[] yMiddle = {(y[0] + y[1])/2, (y[1] + y[2])/2, (y[0] + y[2])/2};

            paintTriangleRescusive(g, level-1, new int[]{x[0], xMiddle[0], xMiddle[2]}, new int[]{y[0], yMiddle[0], yMiddle[2]});
            paintTriangleRescusive(g, level-1, new int[]{xMiddle[0], x[1], xMiddle[1]}, new int[]{yMiddle[0], y[1], yMiddle[1]});
            paintTriangleRescusive(g, level-1, new int[]{xMiddle[2], xMiddle[1], x[2]}, new int[]{yMiddle[2], yMiddle[1], y[2]});           
        }      
    }

    @Override
    protected void paintComponent(Graphics g){
       super.paintComponent(g);    
       int[] x = {super.getWidth()/2, 10, super.getWidth()-10};  
       int[] y = {10, super.getHeight()-10, super.getHeight()-10};
       paintTriangleRescusive(g, level, x, y);
    }   
}
