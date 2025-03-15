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
    
    public void addPerson(Person p);
    
    public Person getNextPerson();
    
    public boolean removePerson(String name);
    
    public String viewQueue();
    
    
    
    
    
    
    
    
}
