/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 31: CrewManagementForm (GUI for managing crew)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

class CrewManagementForm extends JFrame {
    private JTable crewTable;
    private JButton addCrewButton;
    private JButton removeCrewButton;

    public CrewManagementForm() {
        setTitle("Crew Management");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        crewTable = new JTable();
        crewTable.setBounds(20, 20, 450, 250);
        add(crewTable);

        addCrewButton = new JButton("Add Crew");
        addCrewButton.setBounds(50, 300, 150, 30);
        add(addCrewButton);

        removeCrewButton = new JButton("Remove Crew");
        removeCrewButton.setBounds(250, 300, 150, 30);
        add(removeCrewButton);
    }
}