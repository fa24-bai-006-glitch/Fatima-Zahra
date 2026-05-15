/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 7: Seat (Composition with Passenger)
class Seat {
    private String seatNumber; // Encapsulated seat number
    private Passenger passenger; // Composition: Seat HAS-A Passenger

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void assignPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}