/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 15: SeatSelectionForm (GUI for Selecting Seats)

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

class SeatSelectionForm extends JFrame {
    private JComboBox<String> seatList; // Dropdown for seat selection
    private JButton confirmButton; // Confirm seat button

    public SeatSelectionForm() {
        setTitle("Seat Selection");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        seatList = new JComboBox<>(); // Combo box for seats
        seatList.setBounds(50, 40, 200, 30);
        add(seatList);

        confirmButton = new JButton("Confirm"); // Confirm button
        confirmButton.setBounds(100, 100, 100, 30);
        add(confirmButton);
    }
}
