/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author pyaku
 */
public interface BloodTestQueueInterface {
    
    
    //checks if the queue is empty 
    public boolean isEmpty();

    //Returns the size of the queue
    public int size();

    //Adds people to the queue
    public void enqueue(Person element);

    //Removes the people from the front of the queue
    public Person dequeue();
 
    //Displays the queue
    public void displayQueue();
    
   public void removePersonFromQueue(Person person);

}
