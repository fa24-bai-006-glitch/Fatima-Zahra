/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 23: InputValidation (Handles input validation)
class InputValidation {
    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidID(String id) {
        return id != null && id.matches("[A-Z0-9]{3,10}");
    }
}