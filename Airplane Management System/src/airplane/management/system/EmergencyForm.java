/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 38: EmergencyForm (GUI for emergencies/alerts)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class EmergencyForm extends JFrame {
private JTextArea emergencyArea;
private JButton alertButton;


public EmergencyForm() {
setTitle("Emergency Alerts");
setSize(400, 300);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setLayout(null);


emergencyArea = new JTextArea();
emergencyArea.setBounds(20, 20, 350, 180);
add(emergencyArea);


alertButton = new JButton("Send Alert");
alertButton.setBounds(150, 220, 120, 30);
add(alertButton);
}
}