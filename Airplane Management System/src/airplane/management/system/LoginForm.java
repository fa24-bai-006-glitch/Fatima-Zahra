/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 13: LoginForm (Swing GUI Form)
import javax.swing.*; // Importing Swing components
class LoginForm extends JFrame { // JFrame parent class
    JTextField usernameField; // Text field for username input
    JPasswordField passwordField; // Password input
    JButton loginButton; // Button for login action

    public LoginForm() {
        setTitle("Login Form"); // Setting window title
        setSize(300, 200); // Setting size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        setLayout(null); // Using null layout (manual positioning)

        usernameField = new JTextField(); // Creating text field
        usernameField.setBounds(50, 30, 200, 30); // Setting position
        add(usernameField); // Adding to JFrame

        passwordField = new JPasswordField(); // Creating password field
        passwordField.setBounds(50, 70, 200, 30); // Setting position
        add(passwordField); // Adding to JFrame

        loginButton = new JButton("Login"); // Creating login button
        loginButton.setBounds(100, 120, 100, 30); // Setting button size and position
        add(loginButton); // Adding to JFrame
    }
}