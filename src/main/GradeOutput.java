package main;
import javax.swing.*;
import java.awt.event.*;


public class GradeOutput {
    // Declare private variables for the Swing components
    private JLabel lblStudentName, lblMilestone1, lblMilestone2, lblTerminalAssessment, lblTotalGrade;
    private JTextField txtStudentName, txtMilestone1, txtMilestone2, txtTerminalAssessment, txtTotalGrade;
    private JButton closeButton;


    public GradeOutput(Student stud) {
		JFrame frame = new JFrame();
        frame.setSize(450, 250);
        frame.setTitle("Student Total Grade");

        // Create the components
        // Create labels
        lblStudentName = new JLabel("Student Name:");
        lblMilestone1 = new JLabel("Milestone 1:");
        lblMilestone2 = new JLabel("Milestone 2:");
        lblTerminalAssessment = new JLabel("Terminal Assessment:");
        lblTotalGrade = new JLabel("Total Grade:");
       
        // Create Student Name textfield
        txtStudentName = new JTextField(30);
        txtStudentName.setEnabled(false);
        txtStudentName.setText(stud.getStudentName());
       
        // Create Quiz 1 textfield
        txtMilestone1 = new JTextField(10);
        txtMilestone1.setEnabled(false);
        txtMilestone1.setText(stud.getMilestone1());
       
        // Create Quiz 2 textfield
        txtMilestone2 = new JTextField(10);
        txtMilestone2.setEnabled(false);
        txtMilestone2.setText(stud.getMilestone2());
       
        // Create Quiz 3 textfield
        txtTerminalAssessment = new JTextField(10);
        txtTerminalAssessment.setEnabled(false);
        txtTerminalAssessment.setText(stud.getTerminalAssessment());
       
        // Create Average Grade textfield
        txtTotalGrade = new JTextField(10);
        txtTotalGrade.setEnabled(false);
        txtTotalGrade.setText(stud.getTotalGrade());
       
        // Create Close button
        closeButton = new JButton("Close");
       
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
        panel.add(lblTotalGrade);
        panel.add(txtTotalGrade);
        panel.add(closeButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
        //layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTerminalAssessment, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTotalGrade, 6, SpringLayout.WEST, panel);
       
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
        layout.putConstraint(SpringLayout.NORTH, lblTotalGrade, 10, SpringLayout.SOUTH, lblTerminalAssessment);
        layout.putConstraint(SpringLayout.NORTH, txtTotalGrade, 6, SpringLayout.SOUTH, txtTerminalAssessment);
       
        // Set textfield position: right
        layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
        //layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
        layout.putConstraint(SpringLayout.WEST, txtMilestone1, 51, SpringLayout.EAST, lblMilestone1);
        layout.putConstraint(SpringLayout.WEST, txtMilestone2, 51, SpringLayout.EAST, lblMilestone2);
        layout.putConstraint(SpringLayout.WEST, txtTerminalAssessment, 51, SpringLayout.EAST, lblTerminalAssessment);
        layout.putConstraint(SpringLayout.WEST, txtTotalGrade, 51, SpringLayout.EAST, lblTotalGrade);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, closeButton, 6, SpringLayout.SOUTH, txtTotalGrade);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        frame.add(panel);
        frame.setVisible(true);


        // Add an ActionListener to the button
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}