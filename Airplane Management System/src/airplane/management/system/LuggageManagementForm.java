/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 37: LuggageManagementForm (GUI for baggage handling)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

class LuggageManagementForm extends JFrame {
private JTable luggageTable;
private JButton addBaggageButton;
private JButton removeBaggageButton;


public LuggageManagementForm() {
setTitle("Luggage Management");
setSize(500, 400);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setLayout(null);


luggageTable = new JTable();
luggageTable.setBounds(20, 20, 450, 250);
add(luggageTable);
addBaggageButton = new JButton("Add Baggage");
addBaggageButton.setBounds(50, 300, 150, 30);
add(addBaggageButton);


removeBaggageButton = new JButton("Remove Baggage");
removeBaggageButton.setBounds(250, 300, 150, 30);
add(removeBaggageButton);
}
}