/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 4: Passenger
class Passenger extends Person {
    private String ticketNumber;

    public Passenger(String name, String id, String ticketNumber) {
        super(name, id);
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
