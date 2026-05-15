/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 16: AdminPanelForm (GUI Admin Control Panel)

import javax.swing.JButton;
import javax.swing.JFrame;

class AdminPanelForm extends JFrame {
    private JButton viewReportsButton; // Button to view system reports
    private JButton systemSettingsButton; // Button for settings

    public AdminPanelForm() {
        setTitle("Admin Panel");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        viewReportsButton = new JButton("Reports");
        viewReportsButton.setBounds(60, 80, 100, 30);
        add(viewReportsButton);

        systemSettingsButton = new JButton("Settings");
        systemSettingsButton.setBounds(180, 80, 100, 30);
        add(systemSettingsButton);
    }
}