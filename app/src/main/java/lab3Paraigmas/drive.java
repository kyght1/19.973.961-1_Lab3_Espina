/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3Paraigmas;
import java.util.ArrayList;
/**
 *
 * @author Toshiba
 */
public class drive extends element{
    private String letter;
    private int capacity;
    private ArrayList<Object> data = new ArrayList<>();

    /**
     *constructor
     * 
     * @param letter
     * @param capacity
     * @param id
     * @param name
     */
    public drive(String letter, int capacity, int id, String name) {
        super(id, name);
        this.letter = letter;
        this.capacity = capacity;
    }

    /**
     *getter
     * 
     * @return 
     */
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
   
    
    /*metodos*/

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "drive{" + "nameUnity =" + name + ",  letter=" + letter + ", capacity=" + capacity + ", data=" + data + '}';
    }

    
    

   
    
}