/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
import javax.swing.*;
import java.awt.event.*;

// Main class to launch the Airplane Management System GUI
public class Main {

    public static void main(String[] args) {
        // Create and show the LoginForm
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);

        // Add action listener to the login button
        loginForm.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = loginForm.usernameField.getText();
                String password = new String(loginForm.passwordField.getPassword());

                // Simple login validation (replace with proper validation or DB)
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(loginForm, "Login Successful!");

                    // Open DashboardForm
                    DashboardForm dashboard = new DashboardForm();
                    dashboard.setVisible(true);

                    // Close the login form
                    loginForm.dispose();

                    // Example: Add button actions in DashboardForm
                    dashboard.manageFlightsButton.addActionListener(ev -> {
                        FlightManagementForm flightForm = new FlightManagementForm();
                        flightForm.setVisible(true);
                    });

                    dashboard.managePassengersButton.addActionListener(ev -> {
                        PassengerManagementForm passengerForm = new PassengerManagementForm();
                        passengerForm.setVisible(true);
                    });

                } else {
                    JOptionPane.showMessageDialog(loginForm, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}


