/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 19: FlightManagementForm (GUI to manage flights)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

class FlightManagementForm extends JFrame {
    private JTable flightTable; // Table to display flights
    private JButton addFlightButton; // Add flight button
    private JButton removeFlightButton; // Remove flight button

    public FlightManagementForm() {
        setTitle("Flight Management");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        flightTable = new JTable(); // Placeholder table
        flightTable.setBounds(20, 20, 450, 250);
        add(flightTable);

        addFlightButton = new JButton("Add Flight");
        addFlightButton.setBounds(50, 300, 150, 30);
        add(addFlightButton);

        removeFlightButton = new JButton("Remove Flight");
        removeFlightButton.setBounds(250, 300, 150, 30);
        add(removeFlightButton);
    }
}