/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 36: DataPersistenceHandler (Handles saving/loading multiple object types)
class DataPersistenceHandler {
    private FileHandler fileHandler;

    public DataPersistenceHandler() {
        fileHandler = new FileHandler();
    }

    public void saveFlights(GenericList<Flight> flights) {
        fileHandler.saveData("flights.dat", flights);
    }

    public GenericList<Flight> loadFlights() {
        Object obj = fileHandler.loadData("flights.dat");
        if (obj instanceof GenericList) {
            return (GenericList<Flight>) obj;
        }
        return new GenericList<>();
    }
}

