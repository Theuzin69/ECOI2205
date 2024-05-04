//********************************************************************
// ReboundPanel.java Author: Lewis/Loftus
//
// Represents the primary panel for the Rebound program.
//********************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ReboundPanel extends JPanel {
    private final int WIDTH = 711, HEIGHT = 400;
    private final int DELAY = 20, IMAGE_SIZE = 35;
    private ImageIcon imageOriginal, image2;
    private Timer timer;
    private int x, x2, y, y2, moveX, moveX2, moveY, moveY2;
//-----------------------------------------------------------------
// Sets up the panel, including the timer for the animation.
//-----------------------------------------------------------------
    public ReboundPanel() {
        timer = new Timer(DELAY, new ReboundListener());
        imageOriginal = new ImageIcon ("C:\\Users\\cocob\\IdeaProjects\\ReboundRevisited\\src\\Captura de tela 2022-09-27 094623.png");
        image2 = new ImageIcon ("C:\\Users\\cocob\\IdeaProjects\\ReboundRevisited\\src\\Captura de tela 2022-09-27 094623.png");
        x = 0;
        y = 40;
        moveX = moveY = 3;
        x2 = 0;
        y2 = 40;
        moveX2 = 5; moveY2 = 8;
        setPreferredSize (new Dimension(WIDTH, HEIGHT));
        setBackground (Color.black);
        timer.start();
    }
//-----------------------------------------------------------------
// Draws the image in the current location.
//-----------------------------------------------------------------
    public void paintComponent (Graphics page) {
        super.paintComponent (page);
        imageOriginal.paintIcon (this, page, x, y);
        image2.paintIcon (this, page, x2, y2);
    }
//*****************************************************************
// Represents the action listener for the timer.
//*****************************************************************
    private class ReboundListener implements ActionListener {
//--------------------------------------------------------------
// Updates the position of the image and possibly the direction
// of movement whenever the timer fires an action event.
//--------------------------------------------------------------
        public void actionPerformed (ActionEvent event) {
            x += moveX;
            y += moveY;

            x2 += moveX2;
            y2 += moveY2;

            if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
                moveX = moveX * -1;
            if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
                moveY = moveY * -1;

            if (x2 <= 0 || x2 >= WIDTH-IMAGE_SIZE)
                moveX2 = moveX2 * -1;
            if (y2 <= 0 || y2 >= HEIGHT-IMAGE_SIZE)
                moveY2 = moveY2 * -1;
            repaint();
        }
    }
}
