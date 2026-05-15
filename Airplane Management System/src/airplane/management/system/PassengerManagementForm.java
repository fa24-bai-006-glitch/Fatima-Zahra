/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 20: PassengerManagementForm (GUI to manage passengers)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

class PassengerManagementForm extends JFrame {
    private JTable passengerTable;
    private JButton addPassengerButton;
    private JButton removePassengerButton;

    public PassengerManagementForm() {
        setTitle("Passenger Management");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        passengerTable = new JTable();
        passengerTable.setBounds(20, 20, 450, 250);
        add(passengerTable);

        addPassengerButton = new JButton("Add Passenger");
        addPassengerButton.setBounds(50, 300, 150, 30);
        add(addPassengerButton);

        removePassengerButton = new JButton("Remove Passenger");
        removePassengerButton.setBounds(250, 300, 150, 30);
        add(removePassengerButton);
    }
}
