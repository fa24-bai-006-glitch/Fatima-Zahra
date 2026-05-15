/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 18: CustomerSupportForm (GUI for Complaints Handling)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class CustomerSupportForm extends JFrame {
    private JTextArea complaintArea; // Text area for complaint text
    private JButton submitButton; // Submit complaint button

    public CustomerSupportForm() {
        setTitle("Customer Support");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        complaintArea = new JTextArea();
        complaintArea.setBounds(50, 50, 300, 120);
        add(complaintArea);

        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 200, 100, 30);
        add(submitButton);
    }
}