/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 39: FlightOperations (Abstract class for different operations)
abstract class FlightOperations {
public abstract void takeOff();
public abstract void land();
public abstract void delay(String reason);
}