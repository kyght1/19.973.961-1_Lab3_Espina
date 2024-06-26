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
public class Directory extends element {

    
    private String creationDate;
    private String modDate;
    private ArrayList<String> atributes;
    private ArrayList<Object> dataDirectory;
    private String hash;
    public Directory(int id_father, String creationDate, String modDate, ArrayList<String> atributes, ArrayList<Object> dataDirectory, String hash, int id, String name) {
        super(id, name);
        this.id_father = id_father;
        this.creationDate = creationDate;
        this.modDate = modDate;
        this.atributes = atributes;
        this.dataDirectory = dataDirectory;
        this.hash = hash;
    }
    
    @Override
    public Directory clone() throws CloneNotSupportedException{
        Directory newDir = (Directory) super.clone();
        newDir.setCreationDate(newDir.getCreationDate());
        newDir.setModDate(newDir.getModDate());
        newDir.setAtributes(newDir.getAtributes());
        newDir.setDataDirectory(newDir.getDataDirectory());
        newDir.setHash(newDir.getHash());
        return newDir;
    }


    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public ArrayList<String> getAtributes() {
        return atributes;
    }

    public void setAtributes(ArrayList<String> atributes) {
        this.atributes = atributes;
    }

    public ArrayList<Object> getDataDirectory() {
        return dataDirectory;
    }

    public void setDataDirectory(ArrayList<Object> dataDirectory) {
        this.dataDirectory = dataDirectory;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    

    @Override
    public String toString() {
        return "Directory{" + "id=" +id + ", " + name + " id_father=" + id_father + ", " + creationDate + ", " + dataDirectory +'}';
    }
                
   
   

}