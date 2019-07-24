/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 18, Problem 7
 * Purpose of Assignment: To output a circle using the paint() method in response
 *          to user clicking on the screen. The pixel radius requested for the 
 *          circle is tiny, therefore, I included two other radius sizes that
 *          are commented out. I use a radius of 9 so I can easily see the dots
 *
 */
package meganostrander_chapter18_problem7;

/**
 *
 * @author Megan Ostrander
 */

import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;

public class MouseDemo extends JFrame implements MouseListener {

    //create variables to hold coordinates and use in multiple methods
    private int x;
    private int y;
    //int r = 50; Made larger for testing purposes
    private int r = 9;
    //private int r = 3;
    
    
    
    //specify specific actions to take for at least one of these default functions
    public void mouseClicked(MouseEvent e)
    {
        //need an actual object of graphics to paint multiple circles!
        Graphics g = getGraphics();
        
        //print coordinates to console (testing),
        //set x and y variables to coordinates. call paint()
        System.out.println(e.getX() + " " + e.getY());
        this.x = e.getX();
        this.y = e.getY();
        
        //place the paint method WITHIN click event is possible!
        g.setColor(Color.BLUE);
        g.fillOval(this.x, this.y, r, r);
        
        //repaint(); //use this to call paint method!!
    }
    public void mouseEntered(MouseEvent e){};
    public void mousePressed(MouseEvent e){};
    public void mouseReleased(MouseEvent e){};
    public void mouseExited(MouseEvent e){};
    
    
    //object constructor for the program window.
    public MouseDemo()
    {
        super();
        setSize(600,400); 
        setTitle("Mouse Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this); //add listener to this object
    }
    
    /*
    //paint method that creates the circle on user click
    public void paint(Graphics g)
    {
        
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(this.x, this.y, r, r);

    }
*/
    
    //creates the object for program and displays program through object
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 18, Problem 7");
        System.out.println("______________________________________");
        System.out.println("");
        
        MouseDemo m = new MouseDemo(); //create new GUI object
        m.setVisible(true); //make visible to user
    }
    
}
