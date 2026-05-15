/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 28: MaintenanceRecord (Represents maintenance of aircraft)
import java.time.LocalDate;
class MaintenanceRecord {
    private Aircraft aircraft;
    private LocalDate date;
    private String description;

    public MaintenanceRecord(Aircraft aircraft, LocalDate date, String description) {
        this.aircraft = aircraft;
        this.date = date;
        this.description = description;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
