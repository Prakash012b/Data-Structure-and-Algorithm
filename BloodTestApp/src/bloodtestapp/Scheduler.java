/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author pyaku
 */
public class Scheduler implements SchedulerInterface {
    private BloodTestPQ priorityQueue = new BloodTestPQ();
    private BloodTestQueue queue = new BloodTestQueue();
    
    
    //Getter for the queue 
    public BloodTestQueue getQueue() {
    return queue;
}
    
    
    
    @Override
    public void addPerson(Person p) {
        priorityQueue.enqueue(p); // To add person to priority queue
        queue.enqueue(p); // To add person to normal queue
    }

    @Override
    public Person getNextPerson() {
        return priorityQueue.dequeue(); // It removes person based on priority
    }

    @Override
    public boolean removePerson(String name) {
        BloodTestQueue tempQueue = new BloodTestQueue();
        boolean found = false;

        //While loop to run through queue to find and remove the  person
        while (!queue.isEmpty()) {
            Person p = queue.dequeue();
            if (p.getName().equalsIgnoreCase(name)) {
                found = true; //marks found and skips adding back
            } else {
                tempQueue.enqueue(p);
            }
        }

        // While loop to restore the queue without removed person
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }

        return found; //It returns true if th eperson was found and removed
    }


    @Override
    public String viewQueue() {
        queue.displayQueue(); // Prints queue to the console
        return queue.toString(); // Returns formatted queue String
    }
}
