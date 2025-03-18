/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author pyaku
 */
public interface PQInterface {
    
    //Add the  new person to tshe priority queue
    public void enqueue(Person item);

    //Returns the number of people in the PQ and returns the size of the PQ
    public int size();

    //Return True if the priority queue is empty
    public boolean isEmpty();

    //removes and returns the person which has the highest priority
    public Person dequeue();

     //Return the person with highest priority without removing it
    public void displayQueue();
    
    
    public void removePersonFromPQ(Person person);
    
}
