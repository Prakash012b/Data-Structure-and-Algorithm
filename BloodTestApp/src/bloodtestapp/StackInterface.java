/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author pyaku
 */
public interface StackInterface {
   
    //Adds an element to the top of the stack
    public void push(Person element);
    
    //Removes and returns the element from the top of the stack
    public Person pop();
    
    //Returns the element from the top of the stack without removing it
    public Person peek();
    
    
    //checks if the stack is empty
    public boolean isEmpty();
    
    
    //Returns the size of the stack
    public int size();
    
    //Displays the last 5 people added to the stack from top to bottom
    public String viewNotShown();
    
}
