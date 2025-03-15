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
     
     
     //Constructor to initialize the queue
     public BloodTestQueue(){
         theQueue = new LinkedList<>();
     }
    
     
     //Checks if the queue is empty 
    @Override
    public boolean isEmpty() {
         return theQueue.isEmpty();
    }

    
    //Return the size of the queue
    @Override
    public int size() {
           return theQueue.size();    }


    
    //Adds the new person to the queue
    @Override
    public void enqueue(Person newElement) {
            theQueue.add(newElement);
        }

    
    //It removes and returns the first person in the queue as queue uses (FIFO) 
    @Override
    public Person dequeue() {
        if (!theQueue.isEmpty()) {
                   return theQueue.remove(0);
               } else {
                   return null; //
               }
      }
    

    
        @Override
    public void displayQueue() {
        
        //checks if the queue is empty
    if (theQueue.isEmpty()) {
        System.out.println("Queue is empty.");
    } else {
        System.out.println("Current Queue:");
        for (Person p : theQueue) {  // Loop through the queue and prints each person's details
            System.out.println(p);   // Calls Person's toString() method of person class
        }
    }
}
    
        @Override
    public String toString() {
        if (theQueue.isEmpty()) {
            return "Queue is empty.";
        }

        //Use of stringBuilder to construct the queue output string efficiently
        StringBuilder sb = new StringBuilder();
        sb.append("Current Queue:\n");

        //Loop through th equeue and append each person's details
        for (Person p : theQueue) {
            sb.append(p.toString()).append("\n"); // Calls Person's toString()
        }

        //To return the final queue representation as a string
        return sb.toString();
    }


    //Getter method to return the queue (for external access)
    public LinkedList<Person> getQueue() {
        return theQueue;
    }
   
}
