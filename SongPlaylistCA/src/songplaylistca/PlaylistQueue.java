/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songplaylistca;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class PlaylistQueue implements QueueInterface{
    private ArrayList<SongsClass> theQueue;
    
    public PlaylistQueue(){
     theQueue = new ArrayList<SongsClass>(); 
    } 
    
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Liked List\n");
        for (SongsClass song : theQueue) {
            sb.append(song.toString()).append("\n");
        }
        return sb.toString();
    }
    
    @Override
    public boolean isEmpty(){
        
        return theQueue.isEmpty();
        
    }
    @Override
    public int listsize(){
        
        return  theQueue.size();
        
    }
    @Override
    public Object frontElement(){
        if (theQueue.size() > 0){
            return theQueue.get(0);
            }else {
            
        return null;
        }

        
    }
    @Override
    public void enqueue(Object element){
        theQueue.add((SongsClass)element);
        
    }
    @Override
    public Object dequeue(){
        if (theQueue.size() > 0 ) {
    return theQueue.remove(0);
    }else{
    return null;
    }
    
        
        

        
        
    }
    
    
   
    
}
