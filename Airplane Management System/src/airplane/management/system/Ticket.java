/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 8: Ticket (Aggregation)
class Ticket {
    private Passenger passenger; // Aggregation
    private Flight flight; // Ticket linked to Flight
    private double price;

    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }
}
