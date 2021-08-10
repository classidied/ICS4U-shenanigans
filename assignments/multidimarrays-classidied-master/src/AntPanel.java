
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author claire
 */
public class AntPanel extends javax.swing.JPanel {
    
    // initializing variables
    Ant ant = new Ant(9, 9); // starting in center
    Image img;
    Timer t;
    int ms = 20;
    // directions 
    int dir = 1; // init direction is N, E = 2, S = 3, W = 4
    // creating the grid + board
    boolean[][] board; 
    int c = 35; // cell width
    /**
     * Creates new form AntPanel
     */
    
    public AntPanel() {
        initComponents();
        t = new Timer(ms, new TimerListener());
        // default image (frog because ants aren't as cool)
        img = Toolkit.getDefaultToolkit().getImage("frog.png");
        board = new boolean[18][19];
        // initializing board
        // grid[0].length = rows, grid.length = columns
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                // setting initial board as all white
                board[j][i] = true;
            }
        }
    }
    // paint method
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        // drawing the grid
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                // painting board
                if (board[j][i] == true) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                // multiplying width by i, height by j to get coordinates
                g.fillRect(i*c, j*c, c, c);
                // drawing grid
                g.setColor(Color.BLACK);
                g.drawRect(i*c, j*c, c, c);
                // if ant is in specified position, draw
                if (place(i, j)) {
                    // centering image
                    g.drawImage(img, i*c, j*c + 4, this);
                }
            }
        }   
    }
    /*
    Rules:
    At white square, turn 90° right, flip the color of the square, move forward one unit
    At a black square, turn 90° left, flip the color of the square, move forward one unit
    */
    
    // updating board by rotating ant + changing color of board
    public void modBoard(boolean[][] board) {
        // if cell is white, rotate right and switch color to black, else rotate left switch to white
        if (board[ant.y][ant.x] == true) {
            // if the ant rotates right again reset back to 1
            if (dir == 4) {
                dir = 1;
            } else {
                // rotating right
                dir++;
            }
            // flipping to black
            board[ant.y][ant.x] = false; 
        } else {
            // if the ant rotates left again reset back to 4
            if (dir == 1) {
                dir = 4;
            } else {
                // rotating left
                dir--;
            }  
            // flipping to white
            board[ant.y][ant.x] = true;
        }
    }
    // method to check walls
    public void checkWall() {
         // checking for wall and defaulting to the opposite wall
        if (dir == 4  && ant.x - 1 == -1) { // if the cell in that direction is unreachable, default to opposite wall
            ant.x = board[0].length; 
        } else if (dir == 1 && ant.y - 1 == -1) {
            ant.y = board.length;
        } else if (dir == 3 && ant.y + 1 == board.length) {
            ant.y = 0;
        } else if (dir == 2 && ant.x + 1 == board[0].length) {
            ant.x = 0;
        }
    }
    // method to move ant
    public void moveAnt() {
        // moving ant based on dir (modifying coordinates)
        switch (dir) {
            case 1:
                // move north
                ant.y--;
                break;
            case 2:
                // move east
                ant.x++;
                break;
            case 3:
                // move south
                ant.y++;
                break;
            case 4:
                // move west
                ant.x--;
                break;
            default:
                break;
        }
    }
    // method to place ant
    public boolean place(int i, int j) {
        // subtracting 1 from both coordinates because array is 0 indexed
        return ant.x == i && ant.y == j;
    }
    // performs actions
    private class TimerListener implements ActionListener { 
       @Override
        public void actionPerformed(ActionEvent e) {
            checkWall();
            moveAnt();
            modBoard(board);
            
            repaint();
        }
    }
    // animate
    public void anim() {
        t.start();
        t.setInitialDelay(ms);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
