package com.mycompany.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VotingSystem extends JFrame implements ActionListener {
    // Labels
    private JLabel ageLabel, genderLabel, resultLabel;
    private JTextField ageField;
    private JRadioButton maleBtn, femaleBtn;
    private JButton voteBtn, resetBtn;
    private ButtonGroup genderGroup;

    // Counters
    private int maleVotes = 0;
    private int femaleVotes = 0;
    private int notEligible = 0;

    public VotingSystem() {
        // Frame setup
        setTitle("Voting System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Components
        ageLabel = new JLabel("Enter Age:");
        ageField = new JTextField();

        genderLabel = new JLabel("Select Gender:");
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);

        voteBtn = new JButton("Cast Vote");
        resetBtn = new JButton("Reset");

        resultLabel = new JLabel("Results will be displayed here");

        // Add listeners
        voteBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        // Add components to frame
        add(ageLabel);
        add(ageField);
        add(genderLabel);
        add(maleBtn);
        add(new JLabel()); // Empty placeholder
        add(femaleBtn);
        add(voteBtn);
        add(resetBtn);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == voteBtn) {
            String ageText = ageField.getText().trim();
            try {
                int age = Integer.parseInt(ageText);
                
                if (age >= 18) {
                    if (maleBtn.isSelected()) {
                        maleVotes++;
                        resultLabel.setText("Vote recorded! (Male Votes: " + maleVotes +
                                            ", Female Votes: " + femaleVotes +
                                            ", Not Eligible: " + notEligible + ")");
                    } else if (femaleBtn.isSelected()) {
                        femaleVotes++;
                        resultLabel.setText("Vote recorded! (Male Votes: " + maleVotes +
                                            ", Female Votes: " + femaleVotes +
                                            ", Not Eligible: " + notEligible + ")");
                    } else {
                        JOptionPane.showMessageDialog(this, "Please select gender!");
                    }
                } else {
                    notEligible++;
                    resultLabel.setText("Not eligible to vote! (Male Votes: " + maleVotes +
                                        ", Female Votes: " + femaleVotes +
                                        ", Not Eligible: " + notEligible + ")");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid age!");
            }
        }
        else if(e.getSource() == resetBtn) {
            maleVotes = 0;
            femaleVotes = 0;
            notEligible = 0;
            ageField.setText("");
            genderGroup.clearSelection();
            resultLabel.setText("Results reset!");
        }
    }

    public static void main(String[] args) {
        new VotingSystem();
    }
}
