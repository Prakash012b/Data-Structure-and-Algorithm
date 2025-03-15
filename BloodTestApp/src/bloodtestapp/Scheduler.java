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
    
    
    @Override
    public void addPerson(Person p) {
        priorityQueue.enqueue(p);
        queue.enqueue(p);
    }

    @Override
    public Person getNextPerson() {
        return priorityQueue.dequeue();
    }

    @Override
    public boolean removePerson(String name) {
        BloodTestQueue tempQueue = new BloodTestQueue();
        boolean found = false;

        while (!queue.isEmpty()) {
            Person p = queue.dequeue();
            if (p.getName().equalsIgnoreCase(name)) {
                found = true;
            } else {
                tempQueue.enqueue(p);
            }
        }

        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }

        return found;
    }


    @Override
    public String viewQueue() {
        queue.displayQueue();
        return queue.toString();
    }
}
