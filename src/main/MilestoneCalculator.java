package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MilestoneCalculator {

    // Variables needed for the calculator
    private JLabel lblStudentName, lblMilestone1, lblMilestone2, lblTerminalAssessment;
    private JTextField txtStudentName, txtMilestone1, txtMilestone2, txtTerminalAssessment;
    private JButton calculateButton;
    
	public MilestoneCalculator () {
		JFrame frame = new JFrame();
        frame.setSize(450, 250);
        frame.setTitle("Student Milestone Calculator");

        // Create the components
        // Create labels and textfields
        lblStudentName = new JLabel("Student Name:");
        txtStudentName = new JTextField(30);
        lblMilestone1 = new JLabel("Milestone 1:");
        txtMilestone1 = new JTextField(10);
        lblMilestone2 = new JLabel("Milestone 2:");
        txtMilestone2 = new JTextField(10);
        lblTerminalAssessment = new JLabel("Terminal Assessment:");
        txtTerminalAssessment = new JTextField(10);
        calculateButton = new JButton("Calculate");
       
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(300, 300);
        panel.setLayout(layout);
       
        // Add the components to the frame
        panel.add(lblStudentName);
        panel.add(txtStudentName);
        panel.add(lblMilestone1);
        panel.add(txtMilestone1);
        panel.add(lblMilestone2);
        panel.add(txtMilestone2);
        panel.add(lblTerminalAssessment);
        panel.add(txtTerminalAssessment);
        panel.add(calculateButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTerminalAssessment, 6, SpringLayout.WEST, panel);
       
        // Set label and textfield position: top and bottom
        layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
        //layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 10, SpringLayout.SOUTH, lblStudentName);
        //layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
        layout.putConstraint(SpringLayout.NORTH, lblMilestone1, 10, SpringLayout.SOUTH, lblStudentName);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone1, 6, SpringLayout.SOUTH, txtStudentName);
        layout.putConstraint(SpringLayout.NORTH, lblMilestone2, 10, SpringLayout.SOUTH, lblMilestone1);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone2, 6, SpringLayout.SOUTH, txtMilestone1);
        layout.putConstraint(SpringLayout.NORTH, lblTerminalAssessment, 10, SpringLayout.SOUTH, lblMilestone2);
        layout.putConstraint(SpringLayout.NORTH, txtTerminalAssessment, 6, SpringLayout.SOUTH, txtMilestone2);
       
        // Set textfield position: right
        layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
        //layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
        layout.putConstraint(SpringLayout.WEST, txtMilestone1, 51, SpringLayout.EAST, lblMilestone1);
        layout.putConstraint(SpringLayout.WEST, txtMilestone2, 51, SpringLayout.EAST, lblMilestone2);
        layout.putConstraint(SpringLayout.WEST, txtTerminalAssessment, 51, SpringLayout.EAST, lblTerminalAssessment);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, txtTerminalAssessment);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        frame.add(panel);
        frame.setVisible(true);

        // Add an ActionListener to the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Instantiate Student class
                Student stud = new Student();
               try {
                   // Assign textfield values to stud object
                   stud.setStudentName(txtStudentName.getText());
                   stud.setMilestone1(Float.parseFloat(txtMilestone1.getText()));
                   stud.setMilestone2(Float.parseFloat(txtMilestone2.getText()));
                   stud.setTerminalAssessment(Float.parseFloat(txtTerminalAssessment.getText()));
                  
                   if (Float.parseFloat(stud.getMilestone1()) < 0 || Float.parseFloat(stud.getMilestone1()) > 25) {
                   	JOptionPane.showMessageDialog(null, "Invalid Milestone 1 Grade");
                   } else if (Float.parseFloat(stud.getMilestone2 ()) < 0 || Float.parseFloat(stud.getMilestone2()) > 40) {
                   	JOptionPane.showMessageDialog(null, "Invalid Milestone 2 Grade");
                   } else if (Float.parseFloat(stud.getTerminalAssessment()) < 0 || Float.parseFloat(stud.getTerminalAssessment()) > 35) {
                   	JOptionPane.showMessageDialog(null, "Invalid Terminal Assessment Grade");
                   } else {
   	                // Instantiate and call GradeOutput class
   	               new GradeOutput(stud);
                   }
               }
               catch (NumberFormatException e1) {
                  	JOptionPane.showMessageDialog(null, "Please enter valid value");
               }
            }
        });
    }
}