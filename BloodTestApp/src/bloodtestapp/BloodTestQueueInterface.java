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

    //Return the people front in queue without removing them from queue
    public Object frontElement();

    //Adds people to the queue
    public void enqueue(Object element);

    //Removes the people from the front of the queue
    public Object dequeue();
}
