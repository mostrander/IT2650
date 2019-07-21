/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 17, Problem 3
 * Purpose of Assignment: To output the name, quantity, and price of 3 items
                and display the information with dollar signs in column format
 *
 */
package calculator;

/**
 *
 * @author Megan Ostrander
 */

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Font;


/**
 Base taken from prebuilt simple calculator program. The base only included
 * addition and subtraction, a blue background, a text field that acted as an
 * entry for user input AND display output (which easily results in mistakes).
*/
public class Calculator extends JFrame 
                        implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int NUMBER_OF_DIGITS = 30;

    private JTextField ioField; 
    private JTextField resultField;
    private double result = 0.0;

    public static void main(String[] args)
    {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 17, Problem 3");
        System.out.println("______________________________________");
        System.out.println("");
        
        Calculator aCalculator = new Calculator( );
        aCalculator.setVisible(true);
    }

    public Calculator( )
    {
        setTitle("Simplified Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout( ));

        //creates text panel for text fields 'resultField' and 'ioField'
        JPanel textPanel = new JPanel( );
        textPanel.setBackground(Color.LIGHT_GRAY);
        textPanel.setLayout(new GridLayout(2,1));
        
        //need a result JTextField here + label
        JLabel resultLabel = new JLabel("Result");
        resultField = 
             new JTextField("0.0", NUMBER_OF_DIGITS);
        resultField.setBackground(Color.WHITE); //this is an entry field!
        resultField.setEditable(false); //Should prevent user from changing text
        resultLabel.setLabelFor(resultField); //tells GUI label is for resultField object
        
        textPanel.add(resultLabel);
        textPanel.add(resultField);
        
        //creates and adds user input text field to textPanel object
        //Add label
        JLabel Operand = new JLabel("Operand");
        textPanel.add(Operand);
        ioField = 
             new JTextField("", NUMBER_OF_DIGITS);
        ioField.setBackground(Color.WHITE); //this is an entry field! changes color
        ioField.setEditable(false); //Should prevent user from changing text
        textPanel.add(ioField);
        
        //adds panel to the GUI project, places in north region of border layout
        add(textPanel, BorderLayout.NORTH);

        
        
        //exterior panel to hold number and reset panels
        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.LIGHT_GRAY);
         

        //erase buttons placed into their own panel for better layout
        JPanel resetPanel = new JPanel( );
        resetPanel.setBackground(Color.LIGHT_GRAY);

        //clear button should erase content in operand field
        JButton clearButton = new JButton("Clear"); 
        clearButton.addActionListener(this);
        resetPanel.add(clearButton);
        
        //reset button should clear content from result field
        JButton resetButton = new JButton("Reset"); 
        resetButton.addActionListener(this);
        resetPanel.add(resetButton);
        
        //add resetPanel to center portion of window layout
        buttonPanel.add(resetPanel);
        

        
        //buttons placed into their own panel
        JPanel numberPanel = new JPanel( );
        numberPanel.setBackground(Color.LIGHT_GRAY);
        numberPanel.setLayout(new GridLayout(4,4)); 
        
        
        JButton sevenButton = new JButton("7"); 
        sevenButton.addActionListener(this);
        numberPanel.add(sevenButton); 
        
        JButton eightButton = new JButton("8"); 
        eightButton.addActionListener(this);
        numberPanel.add(eightButton); 
        
        JButton nineButton = new JButton("9"); 
        nineButton.addActionListener(this);
        numberPanel.add(nineButton); 
        
        JButton divideButton = new JButton("/"); 
        divideButton.addActionListener(this);
        numberPanel.add(divideButton); 
        
        JButton fourButton = new JButton("4"); 
        fourButton.addActionListener(this);
        numberPanel.add(fourButton); 
        
        JButton fiveButton = new JButton("5"); 
        fiveButton.addActionListener(this);
        numberPanel.add(fiveButton); 
        
        JButton sixButton = new JButton("6"); 
        sixButton.addActionListener(this);
        numberPanel.add(sixButton); 
        
        JButton multiplyButton = new JButton("x"); 
        multiplyButton.addActionListener(this);
        numberPanel.add(multiplyButton); 
        
        JButton oneButton = new JButton("1"); 
        oneButton.addActionListener(this);
        numberPanel.add(oneButton); 
        
        JButton twoButton = new JButton("2"); 
        twoButton.addActionListener(this);
        numberPanel.add(twoButton); 
        
        JButton threeButton = new JButton("3"); 
        threeButton.addActionListener(this);
        numberPanel.add(threeButton); 
        
        JButton subtractButton = new JButton("-"); 
        subtractButton.addActionListener(this);
        numberPanel.add(subtractButton); 
        
        JButton zeroButton = new JButton("0"); 
        zeroButton.addActionListener(this);
        numberPanel.add(zeroButton); 
        
        JButton periodButton = new JButton("."); 
        periodButton.addActionListener(this);
        numberPanel.add(periodButton); 
        
        JButton equalButton = new JButton("="); 
        equalButton.addActionListener(this);
        numberPanel.add(equalButton); 
        
        JButton addButton = new JButton("+"); 
        addButton.addActionListener(this);
        numberPanel.add(addButton); 
        
        //add numberPanel to north section of buttonPanel
        buttonPanel.add(numberPanel);
        
        //add buttonPanel to south of window layout
        add(buttonPanel, BorderLayout.CENTER);
        
        
       
       
    }


    public void actionPerformed(ActionEvent e)
    {
        try
        {
            assumingCorrectNumberFormats(e);
        }
        catch (NumberFormatException e2)
        {
            ioField.setText("Error: Reenter Number.");
        }
    }


    //Throws NumberFormatException.
    public void assumingCorrectNumberFormats(ActionEvent e)
    {
        String actionCommand = e.getActionCommand( );

        //numbers for calculator
        if (actionCommand.equals("1"))
        {
            //this is how to add multiple numbers in one ioField action!
            ioField.setText(ioField.getText() + "1"); 
        }
        else if (actionCommand.equals("2"))
        {
            ioField.setText(ioField.getText() + "2"); 
        }
        else if (actionCommand.equals("3"))
        {
            ioField.setText(ioField.getText() + "3"); 
        }
        else if (actionCommand.equals("4"))
        {
            ioField.setText(ioField.getText() + "4"); 
        }
        else if (actionCommand.equals("5"))
        {
            ioField.setText(ioField.getText() + "5"); 
        }
        else if (actionCommand.equals("6"))
        {
            ioField.setText(ioField.getText() + "6"); 
        }
        else if (actionCommand.equals("7"))
        {
            ioField.setText(ioField.getText() + "7"); 
        }
        else if (actionCommand.equals("8"))
        {
            ioField.setText(ioField.getText() + "8"); 
        }
        else if (actionCommand.equals("9"))
        {
            ioField.setText(ioField.getText() + "9"); 
        }
        else if (actionCommand.equals("0"))
        {
            ioField.setText(ioField.getText() + "0"); 
        }
        

        
        //functions for calculator
        else if (actionCommand.equals("+"))
        {
            result = result + stringToDouble(ioField.getText( ));
            resultField.setText(Double.toString(result));
            ioField.setText("");
        }
        else if (actionCommand.equals("-"))
        {
            result = result - stringToDouble(ioField.getText( ));
            resultField.setText(Double.toString(result));
            ioField.setText("");

        }
        else if (actionCommand.equals("x"))
        {
            result = result * stringToDouble(ioField.getText( ));
            resultField.setText(Double.toString(result));
            ioField.setText("");

        }
        else if (actionCommand.equals("/"))
        {
           /* Cannot figure out how to prevent divide by zero for this program
            try
            {
                double infinity = stringToDouble(ioField.getText());
                
                if(infinity == 0)
                {
                    throw new DivisionByZeroException();  
                }
                else
                {
                    result = result / stringToDouble(ioField.getText( ));
                    resultField.setText(Double.toString(result));
                    ioField.setText("");throw new DivisionByZeroException();
                }
            }
            catch(DivisionByZeroException n)
            {
                   resultField.setText("Cannot divide by zero. Please reset.");
            }

            */
            result = result / stringToDouble(ioField.getText( ));
            resultField.setText(Double.toString(result));
                
        }
        
        //clear functions for calculator
        else if (actionCommand.equals("=")) //works!
        {
            resultField.setText(Double.toString(result));
        }
        else if (actionCommand.equals("Reset")) //works
        {
            //resets variable despite being in if statement. put towards end as result
            result = 0.0; 
            resultField.setText("0.0");
        }
        else if (actionCommand.equals("Clear")) //works
        {
            ioField.setText("");
        }
        
        else
            ioField.setText("Unexpected error.");
     }


    //Throws NumberFormatException.
    private static double stringToDouble(String stringObject)
    {
        return Double.parseDouble(stringObject.trim( ));
    }

    
    
    
    
    
    /*
    * Notes about the changes made to the base calculator program for this new
    * calculator.java version.
    *
    * 1. Changed background to gray so entire program looks cohesive. Also, added
    * background color change function to textPanel object.
    *
    * 2. Change textPanel layout to grid from flow so both text fields will appear.
    * 
    * 3. Added labels to the ioField text field, and added a new resultField
    *   text field with label too.
    * 
    * 4. Changed buttonPanel layout from flow to grid to better layout more 
    *   operand options. Moved reset button on panel to 2nd position
    *
    * 5. Added .setEditable(false) to result text field to prevent user alteration
    *   of data. Should still allow system to change text, however.
    *
    * 6. Added all buttons needed for numbers and / * functions, added associated
    *   actionPerformed events.
    *
    * 7. Added an exception handler in case 0 in the value of ioField when / 
    *   is selected. Should prevent dividing by zero.
    */
}