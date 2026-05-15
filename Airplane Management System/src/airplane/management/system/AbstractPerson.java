/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 26: AbstractPerson (Abstract class demonstrating polymorphism)
abstract class AbstractPerson {
    private String name;
    private String id;

    public AbstractPerson(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void displayInfo(); // Abstract method for polymorphism

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
