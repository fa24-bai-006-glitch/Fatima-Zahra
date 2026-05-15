/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 32: FlightScheduleForm (GUI to view flight schedules)

import javax.swing.JFrame;
import javax.swing.JTable;

class FlightScheduleForm extends JFrame {
    private JTable scheduleTable;

    public FlightScheduleForm() {
        setTitle("Flight Schedule");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        scheduleTable = new JTable();
        scheduleTable.setBounds(20, 20, 450, 300);
        add(scheduleTable);
    }
}