/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songplaylistca;

/**
 *
 * @author Alex
 */
public class SongsClass {
    private String name, genre;

    public SongsClass(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

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
    
     @Override
    public String toString() {
        return "Name: " + name + ", Genre: " + genre;
    }
    
}
