/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestapp;
import java.util.Stack;
/**
 *
 * @author pyaku
 */
public class Scheduler implements SchedulerInterface {
    private BloodTestPQ priorityQueue = new BloodTestPQ();
    private BloodTestQueue queue = new BloodTestQueue();
    private NotShownStack stack = new NotShownStack();
    
 
    
    
    
    @Override
    public void addPerson(Person p) {
        priorityQueue.enqueue(p); // To add person to priority queue
        queue.enqueue(p); // To add person to normal queue
    }

    @Override
    public Person getNextPerson() {
        Person nextPerson = priorityQueue.dequeue(); // It removes person based on priority from PQ
    
    if (nextPerson != null) {
            // Remove the same person from the normal queue (FIFO)
           queue.removePersonFromQueue(nextPerson);            
        }
        return nextPerson;
    }
    
    /*
    // Removes the person from the normal queue
        private void removePersonFromQueue(Person p) {
        BloodTestQueue tempQueue = new BloodTestQueue();
        while (!queue.isEmpty()) {
            Person person = queue.dequeue();
            if (!person.equals(p)) {
                tempQueue.enqueue(person);
            }
        }

        // Restore the updated queue
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
    }

*/
    
    
    
    @Override
    public boolean removePerson(String name) {
        BloodTestQueue tempQueue = new BloodTestQueue();
        boolean found = false;
        Person removedPerson = null;

        //While loop to run through queue to find and remove the  person
        while (!queue.isEmpty()) {
            Person p = queue.dequeue();
            if (p.getName().equalsIgnoreCase(name)) {
                found = true; //marks found and skips adding back
                removedPerson = p; //Stores the removed person
            } else {
                tempQueue.enqueue(p);
            }
        }

        // While loop to restore the queue without removed person
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
        
        //if person was found, add them to the not-shown  stack
        if(found && removedPerson !=null){
            //Remove from Priority queue also
            priorityQueue.removePersonFromPQ(removedPerson);
            stack.push(removedPerson);
    }

        return found; //It returns true if th eperson was found and removed
    }

    
   
      @Override
    public void NotShown(Person p) {
        stack.push(p);
    }


    @Override
    public String viewQueue() {
        queue.displayQueue(); // Prints updated state queue to the console
        return queue.toString(); // Returns formatted queue String
    }

    
    //Display the people not show up from the stack
    @Override
  public String viewNotShown() {
        return stack.viewNotShown();
    }

    //Getter for the queue 
    public BloodTestQueue getQueue() {
    return queue;
}
    
    //find the person based on their name neede for deletion from TextArea
    public Person findPerson(String name) {
    for (Person p : queue.getQueue()) {
        if (p.getName().equalsIgnoreCase(name)) {
            return p;
        }
    }
    return null;
}

}
