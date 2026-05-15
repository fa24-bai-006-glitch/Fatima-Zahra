/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 29: BoardingPassForm (GUI to show boarding pass)

import javax.swing.JFrame;
import javax.swing.JTextArea;

class BoardingPassForm extends JFrame {
    private JTextArea boardingInfo;

    public BoardingPassForm() {
        setTitle("Boarding Pass");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        boardingInfo = new JTextArea();
        boardingInfo.setBounds(20, 20, 350, 180);
        add(boardingInfo);
    }
}
