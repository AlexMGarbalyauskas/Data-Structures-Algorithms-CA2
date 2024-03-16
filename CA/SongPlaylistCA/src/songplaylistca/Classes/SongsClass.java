/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songplaylistca.Classes;

/**
 *
 * @author Alex
 */
public class SongsClass {
    private String name, genre;
    
    //constructor
    public SongsClass(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
    
    //gets the variables 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    //makes string text name and genre appear into gui text area
     @Override
    public String toString() {
        return "Name: " + name + ", Genre: " + genre;
    }
    
}
