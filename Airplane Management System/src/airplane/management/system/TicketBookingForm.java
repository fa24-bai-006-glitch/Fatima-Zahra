/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 17: TicketBookingForm (GUI to Book Tickets)

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class TicketBookingForm extends JFrame {
    private JTextField passengerNameField; // Passenger name input
    private JComboBox<String> flightList; // List of flights
    private JButton bookButton; // Book ticket button

    public TicketBookingForm() {
        setTitle("Ticket Booking");
        setSize(350, 280);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        passengerNameField = new JTextField();
        passengerNameField.setBounds(50, 40, 250, 30);
        add(passengerNameField);

        flightList = new JComboBox<>();
        flightList.setBounds(50, 90, 250, 30);
        add(flightList);

        bookButton = new JButton("Book Ticket");
        bookButton.setBounds(100, 150, 150, 40);
        add(bookButton);
    }
}