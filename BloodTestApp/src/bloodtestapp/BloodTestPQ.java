/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestapp;

import java.util.PriorityQueue;

/**
 *
 * @author pyaku
 */
public class BloodTestPQ implements PQInterface{
    
      private PriorityQueue<Person> thePQueue;

      
      //Constructor to initilize the priority queue
    public BloodTestPQ() {
        thePQueue = new PriorityQueue<>();
    }

    // checks the PQ is empty 
    //Return True if the priority queue is empty, false otherwise
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    
    //Returns the number of people in the PQ and returns the size of the PQ
    public int size() {
        return thePQueue.size();
    }

   //Add the  new person to tshe priority queue
    public void enqueue(Person item) {
      thePQueue.add(item);
    }

    

    //removes and returns the person which has the highest priority
    public Person dequeue() {
        if (isEmpty()){
            return null;  // if the priority queue is empty then it returns null
            }
        return thePQueue.remove();
    }

    
    //Return the person with highest priority without removing it
  public void displayQueue(){
      System.out.println("Priority Queue: " + thePQueue);
  } 
}
