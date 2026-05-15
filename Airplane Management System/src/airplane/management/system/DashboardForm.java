/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 14: DashboardForm (Main GUI Dashboard)

import javax.swing.JButton;
import javax.swing.JFrame;

class DashboardForm extends JFrame {
    JButton manageFlightsButton; // Button to open flights panel
    JButton managePassengersButton; // Button to open passengers panel

    public DashboardForm() {
        setTitle("Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        manageFlightsButton = new JButton("Flights");
        manageFlightsButton.setBounds(50, 100, 120, 30);
        add(manageFlightsButton);

        managePassengersButton = new JButton("Passengers");
        managePassengersButton.setBounds(200, 100, 120, 30);
        add(managePassengersButton);
    }
}
