/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 21: ReportsForm (GUI to view reports)

import javax.swing.JFrame;
import javax.swing.JTextArea;

class ReportsForm extends JFrame {
    private JTextArea reportArea;

    public ReportsForm() {
        setTitle("Reports");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        reportArea = new JTextArea();
        reportArea.setBounds(20, 20, 350, 200);
        add(reportArea);
    }
}
