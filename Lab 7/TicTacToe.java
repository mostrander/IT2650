/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 17, Problem 2
 * Purpose of Assignment: To create a tic tac toe game using the java GUI.
 *
 */
package meganostrander_chapter17_problem2;

/**
 *
 * @author Megan Ostrander
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class TicTacToe extends JFrame 
            implements ActionListener
    {
        
    //set width and height of window
        public static int WIDTH = 600;
        public static int HEIGHT = 600;

        private JPanel screen;
        private JPanel gameBoard; //to be used to create new JPanel in demo
        private JLabel turn;
        private JButton reset;
        
        
        private JButton button0;
        private JButton button1;
        private JButton button2;
        private JButton button3;
        private JButton button4;
        private JButton button5;
        private JButton button6;
        private JButton button7;
        private JButton button8;
        


        public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 17, Problem 2");
        System.out.println("______________________________________");
        System.out.println("");
        
        TicTacToe game = new TicTacToe();
        game.setVisible(true);
        
        }
        
        
        public TicTacToe() //has to be SAME as class to work. error otherwise
        {
            super("TicTacToe Game");
            setSize(WIDTH,HEIGHT);
            setBackground(Color.WHITE);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            
            
            //add panel for player label and new game button
            JPanel info = new JPanel();
            info.setBackground(Color.lightGray);
            
            
            //add JLabel to NORTH of border layout.
            turn = new JLabel("X's Turn");
            info.add(turn);
            
            
            //add reset button
            reset = new JButton("New Game");
            reset.addActionListener(this);
            info.add(reset);
            
            
            add(info, BorderLayout.NORTH);
            

            //create JPanel gameBoard.
            gameBoard = new JPanel();
            gameBoard.setBackground(Color.white);
            gameBoard.setLayout(new GridLayout(3,3));
            
            
            //add buttons to grid layout, button labels initially blank
            button0 = new JButton("");
            button0.setBackground(Color.white);
            button0.addActionListener(this);
            gameBoard.add(button0);
            
            button1 = new JButton("");
            button1.setBackground(Color.white);
            button1.addActionListener(this);
            gameBoard.add(button1);
            
            button2 = new JButton("");
            button2.setBackground(Color.white);
            button2.addActionListener(this);
            gameBoard.add(button2);
            
            button3 = new JButton("");
            button3.setBackground(Color.white);
            button3.addActionListener(this);
            gameBoard.add(button3);
            
            button4 = new JButton("");
            button4.setBackground(Color.white);
            button4.addActionListener(this);
            gameBoard.add(button4);
            
            button5 = new JButton("");
            button5.setBackground(Color.white);
            button5.addActionListener(this);
            gameBoard.add(button5);
            
            button6 = new JButton("");
            button6.setBackground(Color.white);
            button6.addActionListener(this);
            gameBoard.add(button6);
            
            button7 = new JButton("");
            button7.setBackground(Color.white);
            button7.addActionListener(this);
            gameBoard.add(button7);
            
            button8 = new JButton("");
            button8.setBackground(Color.white);
            button8.addActionListener(this);
            gameBoard.add(button8);
            
            add(gameBoard);
            
            

            
            
            
        }
        
       
        
        public void actionPerformed(ActionEvent e)
            {
                //for testing purposes
                //System.out.println("Action performed " + turn.getText());
                //System.out.println(e.getSource().toString());
                
                String actionCommand = e.getActionCommand( );
                
                
                //works
                if (actionCommand.equals("New Game"))
                {
                    System.out.println("New Game entered");
                    //should reset all buttons to empty text for new game
                    (button0).setText("");
                    (button1).setText("");
                    (button2).setText("");
                    (button3).setText("");
                    (button4).setText("");
                    (button5).setText("");
                    (button6).setText("");
                    (button7).setText("");
                    (button8).setText("");
                    
                    //reset background colors.
                    button0.setBackground(Color.WHITE);
                    button1.setBackground(Color.WHITE);
                    button2.setBackground(Color.WHITE);
                    button3.setBackground(Color.WHITE);
                    button4.setBackground(Color.WHITE);
                    button5.setBackground(Color.WHITE);
                    button6.setBackground(Color.WHITE);
                    button7.setBackground(Color.WHITE);
                    button8.setBackground(Color.WHITE);
                    
                }
                
                
                
                //works, finally!
                if (actionCommand.equals(""))
                    {
                        //test for obtaining specific button
                        //((JButton)button0).setText("X");
                                
                        if (turn.getText() == ("X's Turn"))
                            {
                                ((JButton)e.getSource()).setText("X");
                                turn.setText("O's Turn"); //this is how you change label text
                            }

                        else if (turn.getText() == ("O's Turn"))
                            {
                                //determine which button was pressed.
                                ((JButton)e.getSource()).setText("O");
                                turn.setText("X's Turn");
                            }        
                    }
                
                
                
                
                //works
                else if ( (((JButton)e.getSource()).getText() == "X") ||
                        (((JButton)e.getSource()).getText() == "O"))
                {
                    System.out.println("Already selected. Please choose another.");
                }
                
                
                //winning conditions
                if(
                          ((button0.getText().equals("X"))  
                        && (button1.getText().equals("X"))
                        && (button2.getText().equals("X")))
                        ||
                        ((button3.getText().equals("X"))  
                        && (button4.getText().equals("X"))
                        && (button5.getText().equals("X")))
                        ||
                        ((button6.getText().equals("X"))  
                        && (button7.getText().equals("X"))
                        && (button8.getText().equals("X")))
                        ||
                        ((button0.getText().equals("X"))  
                        && (button3.getText().equals("X"))
                        && (button6.getText().equals("X")))
                        ||
                        ((button1.getText().equals("X"))  
                        && (button4.getText().equals("X"))
                        && (button7.getText().equals("X")))
                        ||
                        ((button2.getText().equals("X"))  
                        && (button5.getText().equals("X"))
                        && (button8.getText().equals("X")))
                        ||
                        ((button0.getText().equals("X"))  
                        && (button4.getText().equals("X"))
                        && (button8.getText().equals("X")))
                        ||
                        ((button2.getText().equals("X"))  
                        && (button4.getText().equals("X"))
                        && (button6.getText().equals("X")))
                        )
                        
                    //announce winner and color boxes.
                    {
                        turn.setText("X Wins!");   
                        
                        if( (button0.getText().equals("X"))  
                        && (button1.getText().equals("X"))
                        && (button2.getText().equals("X")) )
                        {
                            button0.setBackground(Color.GREEN);
                            button1.setBackground(Color.GREEN);
                            button2.setBackground(Color.GREEN);
                        }
                        
                        if( (button3.getText().equals("X"))  
                        && (button4.getText().equals("X"))
                        && (button5.getText().equals("X")) )
                        {
                            button3.setBackground(Color.GREEN);
                            button4.setBackground(Color.GREEN);
                            button5.setBackground(Color.GREEN);
                        }
                        
                        if( (button6.getText().equals("X"))  
                        && (button7.getText().equals("X"))
                        && (button8.getText().equals("X")) )
                        {
                            button6.setBackground(Color.GREEN);
                            button7.setBackground(Color.GREEN);
                            button8.setBackground(Color.GREEN);
                        }
                        
                        if( (button0.getText().equals("X"))  
                        && (button3.getText().equals("X"))
                        && (button6.getText().equals("X")) )
                        {
                            button0.setBackground(Color.GREEN);
                            button3.setBackground(Color.GREEN);
                            button6.setBackground(Color.GREEN);
                        }
                        
                        if( (button1.getText().equals("X"))  
                        && (button4.getText().equals("X"))
                        && (button7.getText().equals("X")) )
                        {
                            button1.setBackground(Color.GREEN);
                            button4.setBackground(Color.GREEN);
                            button7.setBackground(Color.GREEN);
                        }
                        
                        if( (button2.getText().equals("X"))  
                        && (button5.getText().equals("X"))
                        && (button8.getText().equals("X")) )
                        {
                            button2.setBackground(Color.GREEN);
                            button5.setBackground(Color.GREEN);
                            button8.setBackground(Color.GREEN);
                        }
                        
                        if( (button0.getText().equals("X"))  
                        && (button4.getText().equals("X"))
                        && (button8.getText().equals("X")) )
                        {
                            button0.setBackground(Color.GREEN);
                            button4.setBackground(Color.GREEN);
                            button8.setBackground(Color.GREEN);
                        }
                        
                        if( (button2.getText().equals("X"))  
                        && (button4.getText().equals("X"))
                        && (button6.getText().equals("X")) )
                        {
                            button2.setBackground(Color.GREEN);
                            button4.setBackground(Color.GREEN);
                            button6.setBackground(Color.GREEN);
                        }
                        
                        
                    } //end of winning if condition for X player
                    
                    
                
                
                
                
                
                //winning conditions for player O
                    if(
                          ((button0.getText().equals("O"))  
                        && (button1.getText().equals("O"))
                        && (button2.getText().equals("O")))
                        ||
                        ((button3.getText().equals("O"))  
                        && (button4.getText().equals("O"))
                        && (button5.getText().equals("O")))
                        ||
                        ((button6.getText().equals("O"))  
                        && (button7.getText().equals("O"))
                        && (button8.getText().equals("O")))
                        ||
                        ((button0.getText().equals("O"))  
                        && (button3.getText().equals("O"))
                        && (button6.getText().equals("O")))
                        ||
                        ((button1.getText().equals("O"))  
                        && (button4.getText().equals("O"))
                        && (button7.getText().equals("O")))
                        ||
                        ((button2.getText().equals("O"))  
                        && (button5.getText().equals("O"))
                        && (button8.getText().equals("O")))
                        ||
                        ((button0.getText().equals("O"))  
                        && (button4.getText().equals("O"))
                        && (button8.getText().equals("O")))
                        ||
                        ((button2.getText().equals("O"))  
                        && (button4.getText().equals("O"))
                        && (button6.getText().equals("O")))
                        )
                        
                        //announce winner and color boxes.
                    {
                        turn.setText("O Wins!");   
                        
                        if( (button0.getText().equals("O"))  
                        && (button1.getText().equals("O"))
                        && (button2.getText().equals("O")) )
                        {
                            button0.setBackground(Color.GREEN);
                            button1.setBackground(Color.GREEN);
                            button2.setBackground(Color.GREEN);
                        }
                        
                        if( (button3.getText().equals("O"))  
                        && (button4.getText().equals("O"))
                        && (button5.getText().equals("O")) )
                        {
                            button3.setBackground(Color.GREEN);
                            button4.setBackground(Color.GREEN);
                            button5.setBackground(Color.GREEN);
                        }
                        
                        if( (button6.getText().equals("O"))  
                        && (button7.getText().equals("O"))
                        && (button8.getText().equals("O")) )
                        {
                            button6.setBackground(Color.GREEN);
                            button7.setBackground(Color.GREEN);
                            button8.setBackground(Color.GREEN);
                        }
                        
                        if( (button0.getText().equals("O"))  
                        && (button3.getText().equals("O"))
                        && (button6.getText().equals("O")) )
                        {
                            button0.setBackground(Color.GREEN);
                            button3.setBackground(Color.GREEN);
                            button6.setBackground(Color.GREEN);
                        }
                        
                        if( (button1.getText().equals("O"))  
                        && (button4.getText().equals("O"))
                        && (button7.getText().equals("O")) )
                        {
                            button1.setBackground(Color.GREEN);
                            button4.setBackground(Color.GREEN);
                            button7.setBackground(Color.GREEN);
                        }
                        
                        if( (button2.getText().equals("O"))  
                        && (button5.getText().equals("O"))
                        && (button8.getText().equals("O")) )
                        {
                            button2.setBackground(Color.GREEN);
                            button5.setBackground(Color.GREEN);
                            button8.setBackground(Color.GREEN);
                        }
                        
                        if( (button0.getText().equals("O"))  
                        && (button4.getText().equals("O"))
                        && (button8.getText().equals("O")) )
                        {
                            button0.setBackground(Color.GREEN);
                            button4.setBackground(Color.GREEN);
                            button8.setBackground(Color.GREEN);
                        }
                        
                        if( (button2.getText().equals("O"))  
                        && (button4.getText().equals("O"))
                        && (button6.getText().equals("O")) )
                        {
                            button2.setBackground(Color.GREEN);
                            button4.setBackground(Color.GREEN);
                            button6.setBackground(Color.GREEN);
                        }
                    } //end of winning if condition for O player
                    
                    
                    
                    
                    
                    
                    
                    //if all boxes are selected and no matches found.
                    else if ( (!button0.getText().equals("")) && 
                        (!button1.getText().equals("")) 
                        && (!button2.getText().equals(""))
                        &&(!button3.getText().equals(""))
                        &&(!button4.getText().equals("")) 
                        && (!button5.getText().equals(""))
                        &&(!button6.getText().equals("")) 
                        && (!button7.getText().equals(""))
                        && (!button8.getText().equals(""))
                        )
                        
                    {
                        turn.setText("Tie.");
                    }
                
                
            } //end of action performed
        
        
 
        
    }
