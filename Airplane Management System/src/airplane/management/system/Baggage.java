/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 9: Baggage (Aggregation)
class Baggage {
    private Passenger owner;
    private double weight;

    public Baggage(Passenger owner, double weight) {
        this.owner = owner;
        this.weight = weight;
    }

    public Passenger getOwner() {
        return owner;
    }

    public double getWeight() {
        return weight;
    }
}
