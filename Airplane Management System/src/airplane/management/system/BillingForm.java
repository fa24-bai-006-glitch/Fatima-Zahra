/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 30: BillingForm (GUI for invoice/billing)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class BillingForm extends JFrame {
    private JTextArea invoiceArea;
    private JButton printButton;

    public BillingForm() {
        setTitle("Billing / Invoice");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        invoiceArea = new JTextArea();
        invoiceArea.setBounds(20, 20, 350, 180);
        add(invoiceArea);

        printButton = new JButton("Print Invoice");
        printButton.setBounds(150, 220, 120, 30);
        add(printButton);
    }
}
