/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author pyaku
 */
public interface SchedulerInterface {
    
    //Adds a person to both normal and priority  queue
    public void addPerson(Person p);
    
    
    //Retrives and removes the next person from the priority queue
    public Person getNextPerson(); // The person with highest priority is returned
    
    
    //Removes a person from the normal queue by name
    public boolean removePerson(String name);
    
    //Shows the person that have not shown
    public void NotShown(Person p);
    
    //Display sthe current queue and returns its formatted string representation
    public String viewQueue();
    
    //Display the People not shown from the stack
    public String viewNotShown();
    
    
    
    
    
    
    
    
}
