/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 35: CrewEventHandler (Event handling for crew management)
import java.awt.event.*;
class CrewEventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Crew action performed: " + e.getActionCommand());
    }
}
