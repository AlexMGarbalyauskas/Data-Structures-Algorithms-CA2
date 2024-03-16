/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songplaylistca.Classes;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Alex
 */
public class PlaylistQueue implements QueueInterface, GenreMoveInterface{
    //Arraylists for licked list queue pop and rock list
    private final ArrayList<SongsClass> theQueue;
    private final ArrayList<SongsClass> popList;
    private final ArrayList<SongsClass> rockList;
    private final JTextArea area;
    
    //constructor
    public PlaylistQueue(JTextArea area1){
     theQueue = new ArrayList<>();
     popList = new ArrayList<>();
     rockList = new ArrayList<>();
     //assigns jtextarea to the area field
     this.area = area1; 
    } 
    
    //display method that builds the string into the area
    //it goes through the queue and appends the names 
    public String display() {
        //builds string text
        StringBuilder sb = new StringBuilder();
        //list title appearing on top
        sb.append("Liked List\n");
        //queue songs linked and appears into text area via appending
        for (SongsClass song : theQueue){
            sb.append("Name:" + song.getName()).append("\n");
            sb.append("Genre:" + song.getGenre()).append("\n");
        }
        
        return sb.toString();
    }
    
    //true false checker, checks if the same name was added already
    public boolean hasSong(String songName){
        for (SongsClass song : theQueue){
            if (song.getName().equalsIgnoreCase(songName)){
                return true;
            }
        }
        return false;
    }
    
    //a search method , looks for the given name, returns the 1st song only
    public String search(String songName){
        for (SongsClass song : theQueue){
            //checks if the name of the current song is equal to the songName
            if (song.getName().equalsIgnoreCase(songName)){
                return song.toString();
            }
        }
        return null;  
    }
    
    //Queue Interfaces
    
    //makes sure if its empty or not
    @Override
    public boolean isEmpty(){
        //queue list empty return
        return theQueue.isEmpty();
        
    }
    
    //checks size of list returns number
    @Override
    public int listsize(){
        //size number of list as user adds or deletes
        return  theQueue.size();
        
    }
    
    //gets the first song into the queue , if empty then null, if not empty get 0 returns the song
    @Override
    public Object frontElement(){
        if (!theQueue.isEmpty()){
            //returns song
            return theQueue.get(0);
        }else {     
            return null;
        }
   
    }
    
    //adds song to the end of list
    @Override
    public void enqueue(Object element){
        //adds
        theQueue.add((SongsClass)element);
        
    }
    
    //removes and returns 1st song from list
    @Override
    public Object dequeue(){
        
        if (theQueue.size() > 0 ) {
            return theQueue.remove(0);
        }else{
            return null;
        }
     
    }
    
    
    //Genre move Interface implementation override 
    
    // Moves the songs from the liked list to the genre list
    @Override
    public void moveSong(String genre){
        // Moves songs from the liked list to the genre list
        ArrayList<SongsClass> genreList = (genre.equals("Pop")) ? popList : rockList;
        while (!theQueue.isEmpty()) { 
            SongsClass song = theQueue.remove(0);
            genreList.add(song);
        }
        // Displays genre list
        displayGenreList(genreList, genre);
    }
    
    
    // Method to display genre list
    @Override
    public void displayGenreList(ArrayList<SongsClass> genreList, String genre){
        //
        StringBuilder sb = new StringBuilder();
        sb.append(genre).append(" List\n");
        for (SongsClass song : genreList) {
            sb.append("Name:").append(song.getName()).append("\n");
            sb.append("Genre:").append(song.getGenre()).append("\n");
        }
        //sets the string text into area, updation
        area.setText(sb.toString());
    }
    
    

    
  
}
