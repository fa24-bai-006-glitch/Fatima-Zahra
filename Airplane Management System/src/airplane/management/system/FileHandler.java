/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplane.management.system;
// Class 22: FileHandler (File I/O operations for saving/loading data)
import java.io.*;
class FileHandler {
    public void saveData(String filename, Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(obj); // Serialize object
        } catch (IOException e) {
            e.printStackTrace(); // Exception handling
        }
    }

    public Object loadData(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return ois.readObject(); // Deserialize object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}