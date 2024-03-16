/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package songplaylistca.Classes;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public interface GenreMoveInterface {
    
    //moving method 
    public void moveSong(String genre);
    public void displayGenreList(ArrayList<SongsClass> genreList, String genre);
    
    
}
