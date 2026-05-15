/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 34: FlightEventHandler (Event handling for flight actions)
import java.awt.event.*;
class FlightEventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Flight action performed: " + e.getActionCommand());
    }
}