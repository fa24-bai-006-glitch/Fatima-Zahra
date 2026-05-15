/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 33: GenericList<T> (Generic collection for Flights, Passengers, Tickets)
import java.util.*;
class GenericList<T> {
    private List<T> items;

    public GenericList() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getAll() {
        return items;
    }
}
