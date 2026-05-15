/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 2: Pilot (Inheritance and Method Overriding Demonstration)
class Pilot extends Person {
    private String licenseNumber;

    public Pilot(String name, String id, String licenseNumber) {
        super(name, id);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    // Example of method overriding
    @Override
    public String getName() {
        return "Pilot: " + super.getName();
    }
}
