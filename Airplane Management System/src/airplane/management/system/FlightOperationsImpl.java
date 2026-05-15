/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 40: FlightOperationsImpl (Concrete implementation of FlightOperations)
class FlightOperationsImpl extends FlightOperations {
@Override
public void takeOff() {
System.out.println("Flight is taking off");
}


@Override
public void land() {
System.out.println("Flight has landed");
}


@Override
public void delay(String reason) {
System.out.println("Flight delayed due to: " + reason);
}
}
