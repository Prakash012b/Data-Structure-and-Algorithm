/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestapp;


import java.util.LinkedList;

/**
 *
 * @author pyaku
 */
public class BloodTestQueue implements BloodTestQueueInterface {

    
    //uses the linkedlist to store the peopel object
     private LinkedList<Person> theQueue;
     
     public BloodTestQueue(){
         theQueue = new LinkedList<>();
     }
    
    @Override
    public boolean isEmpty() {
         return theQueue.isEmpty();
    }

    @Override
    public int size() {
           return theQueue.size();    }


    @Override
    public void enqueue(Person newElement) {
            theQueue.add(newElement);
        }

    @Override
    public Person dequeue() {
        if (!theQueue.isEmpty()) {
                   return theQueue.remove(0);
               } else {
                   return null;
               }
      }
    
        @Override
    public void displayQueue() {
          System.out.println("Queue: " +theQueue);
    }

    
}
