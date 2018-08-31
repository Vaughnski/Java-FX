/* Andrew Vaughn
 * Developed 5/7/18
 * Computer Science 2261
 * 
 * Objective: write a Java program that computes the future value of an investment, 
 * at a given interest rate for a specified number of years according to the formula: 
 * Future Value = Investment Amount * (1 + Monthly Interest Rate) Years * 12 
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class InvestmentCalculator extends JFrame

//Implementation 
implements ActionListener
{
JButton btnCal = new JButton("Calculate");
JLabel lblInv = new JLabel("Investment Amount");
JLabel lblYr = new JLabel("Years");
JLabel lblRt = new JLabel("Annual Interest Rate");
JLabel lblRes = new JLabel("Future Value");
JLabel lblBlnk = new JLabel("");

JTextField txtInv = new JTextField(20);
JTextField txtYr = new JTextField(20);
JTextField txtRt = new JTextField(20);
JTextField txtRes = new JTextField(20);

JPanel jp;

public InvestmentCalculator()
{
jp = new JPanel();

// assigning grid layout to the panel
jp.setLayout(new GridLayout(5, 2));

// setting the preferred size to panel
jp.setPreferredSize(new Dimension(400, 250));

// decorating the panel with components
jp.add(lblInv);
jp.add(txtInv);
jp.add(lblYr);
jp.add(txtYr);
jp.add(lblRt);
jp.add(txtRt);
jp.add(lblRes);
jp.add(txtRes);
jp.add(lblBlnk);
jp.add(btnCal);
add(jp);
btnCal.addActionListener(this);
}

// Action handler
public void actionPerformed(ActionEvent e)
{
double inv = Double.parseDouble(txtInv.getText());
int yr = Integer.parseInt(txtYr.getText());
double rt = Double.parseDouble(txtRt.getText());
if(e.getSource() == btnCal)
{
double res = inv * Math.pow((1 + rt), (yr * 12));
System.out.println((10000 *
Math.pow((3.25 + 1),36)));
txtRes.setText(String.valueOf(res));
}
}
// Main method
public static void main(String[] args)
{
JFrame fr = new InvestmentCalculator();
fr.setTitle("Investment Value Calculator");
fr.setLocationRelativeTo(null);
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fr.pack();
fr.setVisible(true);
}
}