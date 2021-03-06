/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeFractal;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author claire
 */
public class FractalTree extends javax.swing.JPanel {
    static double angleFactor = Math.PI / 4;
    static double sizeFactor = 0.7;
    static int depth = 4;
    static int trunkHeight = 100;
    static Random r = new Random(); // making random colors
    static Color cLevel;
    
    /**
     * Creates new form FractalTree
     */
    public FractalTree() {
        initComponents();
    }
    // paint method
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        treeFractal(g,depth,300,450,trunkHeight,Math.PI / 2);
    }
    // drawing fractal
    public void treeFractal(Graphics g, int depth, int x, int y, double length, double angle){
        //calculate the ending x,y coordinates for this line segment.
        //As we are moving up, we subtract from the current base coordinates
        //The formula used to determine end points by definition of sin and cos
        int x1 = x - (int)(Math.cos(angle)*length);
        int y1 = y - (int)(Math.sin(angle)*length);
        //actually draw the line
        g.drawLine(x,y,x1,y1);
        //if we have more depth to go, recurse
        if (depth > 0){
            // make random color
            cLevel = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            // setting level to color
            g.setColor(cLevel);
            treeFractal(g,depth-1,x1,y1,length*sizeFactor,angle+angleFactor);
            treeFractal(g,depth-1,x1,y1,length*sizeFactor,angle-angleFactor);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
